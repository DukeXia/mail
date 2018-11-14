package com.xiaotang.test.task;

import com.xiaotang.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserTask {

    @Autowired
    UserService userService;

    //@Scheduled(initialDelay = 0, fixedRate = 1000 * 5)
    public void showMe(){
        System.out.println(userService.getUserById(1).toString());
    }

}
