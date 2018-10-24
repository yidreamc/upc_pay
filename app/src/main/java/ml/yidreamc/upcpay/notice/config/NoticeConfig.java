package ml.yidreamc.upcpay.notice.config;

import ml.yidreamc.upcpay.notice.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * NoticeConfig class.
 *
 * @author Yidreamc
 * @date 2018/10/24
 */
@Component
public class NoticeConfig {

    @Autowired
    private NoticeService noticeService;

    @PostConstruct
    public void initRedis() {
        noticeService.updateRedis();
    }
}
