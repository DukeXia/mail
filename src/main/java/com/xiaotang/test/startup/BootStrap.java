package com.xiaotang.test.startup;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BootStrap {

    private static ApplicationContext context;

    public static void main(String[] args) {
        context = new ClassPathXmlApplicationContext("resources/spring/applicationContext-*.xml");
        //ApplicationContext ac = new ClassPathXmlApplicationContext("/spring/applicationContext-data.xml");
    }

}
