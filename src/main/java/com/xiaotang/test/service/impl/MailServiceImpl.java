package com.xiaotang.test.service.impl;

import com.xiaotang.test.service.MailService;
import com.xiaotang.test.util.MailUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MailServiceImpl implements MailService {

    @Autowired
    private MailUtil mail;

    @Override
    public void receiveMail() {
        mail.receive();
    }

    @Override
    public void sendMail() {
        try {
            mail.sendMail();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
