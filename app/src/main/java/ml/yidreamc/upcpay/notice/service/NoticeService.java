package ml.yidreamc.upcpay.notice.service;

import ml.yidreamc.upcpay.notice.dto.DateDto;
import ml.yidreamc.upcpay.notice.entity.Notice;
import ml.yidreamc.upcpay.notice.entity.NoticeRepository;
import ml.yidreamc.upcpay.notice.entity.NoticeType;
import ml.yidreamc.upcpay.notice.utils.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

@Service
public class NoticeService {

    @Autowired
    private NoticeRepository noticeRepository;

    @Autowired
    private RedisUtil redisUtil;

    public void updateRedis() {
        Iterator<Notice> notices = noticeRepository.findAll().iterator();
        List<DateDto> dateDtos = new ArrayList<>();
        while (notices.hasNext()) {
            Notice notice = notices.next();
            if (notice.getNoticeType() == NoticeType.DAY) {
                LocalDateTime startTime = LocalDateTime.ofInstant(
                        Instant.ofEpochSecond(notice.getStartTime()),
                        TimeZone.getDefault().toZoneId());
                LocalDateTime endTime = LocalDateTime.ofInstant(
                        Instant.ofEpochSecond(notice.getEndTime()),
                        TimeZone.getDefault().toZoneId());
                DateDto dateDto = new DateDto(startTime.getHour(),
                        startTime.getMinute(),
                        endTime.getHour(),
                        endTime.getMinute(),
                        notice.getMsg());
                dateDtos.add(dateDto);
            }
        }
        redisUtil.setValue("daylyNotice", dateDtos);
    }

    public String checkNow() {
        List<DateDto> dateDtos = (List<DateDto>) redisUtil.getValue("daylyNotice");
        if (dateDtos != null && !dateDtos.isEmpty()) {
            LocalTime now = LocalTime.now();
            for (DateDto d : dateDtos) {
                long nowTr = now.getHour() * 60 + now.getMinute();
                long startTr = d.getStartHour() * 60 + d.getStartMin();
                long endTr = d.getEndHour() * 60 + d.getEndMin();
                // 结束时间不应该比开始时间小，如果小则为跨天
                if (endTr < nowTr) {
                    if (nowTr >= startTr || nowTr <= endTr) {
                        return d.getMsg();
                    }
                } else {
                    if (nowTr >= startTr && nowTr <= endTr) {
                        return d.getMsg();
                    }
                }
            }
        }
        return null;
    }
}
