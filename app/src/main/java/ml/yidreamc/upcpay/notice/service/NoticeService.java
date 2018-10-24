package ml.yidreamc.upcpay.notice.service;

import ml.yidreamc.upcpay.notice.dto.DateDto;
import ml.yidreamc.upcpay.notice.entity.Notice;
import ml.yidreamc.upcpay.notice.entity.NoticeRepository;
import ml.yidreamc.upcpay.notice.entity.NoticeType;
import ml.yidreamc.upcpay.notice.utils.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

@Service
public class NoticeService {

    @Autowired
    private NoticeRepository noticeRepository;

    @Autowired
    private RedisUtil redisUtil;

    void updateRedis() {
        Iterator<Notice> notices = noticeRepository.findAll().iterator();
        List<DateDto> dateDtos = new ArrayList<>();
        while (notices.hasNext()) {
            Notice notice = notices.next();
            if (notice.getNoticeType() == NoticeType.DAY) {
                LocalDateTime startTime = LocalDateTime.ofInstant(Instant.ofEpochSecond(notice.getStartTime()), TimeZone.getDefault().toZoneId());
                LocalDateTime endTime = LocalDateTime.ofInstant(Instant.ofEpochSecond(notice.getEndTime()), TimeZone.getDefault().toZoneId());
                DateDto dateDto = new DateDto(startTime.getHour(),
                        startTime.getMinute(),
                        endTime.getHour(),
                        endTime.getMinute());
                dateDtos.add(dateDto);
            }
        }
        redisUtil.setValue("daylyNotice",dateDtos);
    }
}
