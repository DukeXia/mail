package com.xiaotang.mail.startup;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BootStrap {

    private static ApplicationContext ac;

    public static void main(String[] args) {
         ac = new ClassPathXmlApplicationContext("spring/applicationContext*.xml");
    }

}
