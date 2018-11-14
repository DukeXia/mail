package com.xiaotang.test.task;

import com.xiaotang.test.service.MailService;
import com.xiaotang.test.service.UserService;
import com.xiaotang.test.util.MailUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Usertask {

    @Autowired
    UserService userService;

    @Autowired
    MailService mailService;

    //@Scheduled(initialDelay = 0, fixedRate = 1000 * 5)
    public void showMe(){
        System.out.println(userService.getUserById(1).toString());
    }

    @Scheduled(initialDelay = 0, fixedRate = 1000 * 5)
    public void receive() {
       mailService.receiveMail();
    }

}
