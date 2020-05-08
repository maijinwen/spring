package net.togogo.utils;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

public class MailSender {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("mail-config.xml");
        JavaMailSender sender = (JavaMailSender) ac.getBean("mailSender");
        MimeMessage message = sender.createMimeMessage();

        try {
            MimeMessageHelper messageHelper = new MimeMessageHelper(message, true, "utf-8");
            messageHelper.setFrom("1143513795@qq.com");
            messageHelper.setTo("maijinwen@outlook.com");
            messageHelper.setSubject("这是主题");
            messageHelper.setText("这是邮件内容");
            sender.send(message);
            System.out.println("发送成功");
        } catch (MessagingException e) {
            e.printStackTrace();
        }

    }

}
