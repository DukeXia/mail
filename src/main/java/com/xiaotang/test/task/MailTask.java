package com.xiaotang.test.task;

import com.xiaotang.test.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MailTask {

    @Autowired
    MailService mailService;

    /**
     * 定时接收邮件
     *
     * @param
     *
     * @return
     * */
    @Scheduled(initialDelay = 0, fixedRate = 1000 * 5)
    public void receiveMail(){
        mailService.receiveMail();
    }

}
