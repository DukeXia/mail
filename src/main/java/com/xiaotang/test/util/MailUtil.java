package com.xiaotang.test.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.mail.*;
import java.util.Date;
import java.util.Properties;

/**
 * @ClassName: MailUtil
 * @Description: 发送Email
 * @author: liujt
 * @date: 2018-11-13 下午9:42:56
 *
 */
@Component
public class MailUtil {

    @Value("${tangdou.isSSL}")
    private boolean isSSL;//使用SSL加密

    @Value("${tangdou.host}")
    private String host;//QQ邮箱的pop3服务器

    @Value("${tangdou.port}")
    private int port;//端口

    @Value("${tangdou.username}")
    private String username;//邮件名

    @Value("${tangdou.password}")
    private String password;//密码

    @Value("${tangdou.pop3.protocol}")
    private String protocol;//使用pop3协议

    public void receive(){
        /*
         *Properties是一个属性对象，用来创建Session对象
         */
        Properties props = new Properties();
        props.put("mail.pop3.ssl.enable", isSSL);
        props.put("mail.pop3.host", host);
        props.put("mail.pop3.port", port);
        /*
         *Session类定义了一个基本的邮件对话。
         */
        Session session = Session.getDefaultInstance(props);

        /*
         * Store类实现特定邮件协议上的读、写、监视、查找等操作。
         * 通过Store类可以访问Folder类。
         * Folder类用于分级组织邮件，并提供照Message格式访问email的能力。
         */
        Store store = null;
        Folder folder = null;
        try {
            store = session.getStore(protocol);
            store.connect(username, password);

            folder = store.getFolder("INBOX");
            folder.open(Folder.READ_ONLY);//在这一步，收件箱所有邮件将被下载到本地

            int size = folder.getMessageCount();//获取邮件数目
            Message message = folder.getMessage(size);//取得最新的那个邮件

            //解析邮件内容
            String from = message.getFrom()[0].toString();
            String subject = message.getSubject();
            Date date = message.getSentDate();

            System.out.println("From: " + from);
            System.out.println("Subject: " + subject);
            System.out.println("Date: " + date);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (folder != null) {
                    folder.close(false);
                }
                if (store != null) {
                    store.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("接收完毕！");
    }

}