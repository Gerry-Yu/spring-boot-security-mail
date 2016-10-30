package com.demo.service.impl;

import com.demo.model.User;
import com.demo.service.MailService;
import com.sun.org.apache.xalan.internal.xsltc.compiler.Template;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templateresolver.TemplateResolver;

import javax.mail.internet.MimeMessage;

/**
 * Created by Pinggang Yu on 2016/10/30.
 */
@Service
public class MailServiceImpl implements MailService{

    @Autowired
    private JavaMailSender mailSender;

    @Autowired
    private TemplateEngine templateEngine;

    @Override
    public void sendMail(User user) {
        MimeMessage message = null;
        try {
            message = mailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message, true, "UTF-8");
            helper.setFrom("邮箱名");
            helper.setTo("邮箱名");
            helper.setSubject("Test");
            helper.setText(getHtmlText(user), true);
        } catch (Exception e) {
            e.printStackTrace();
        }
        mailSender.send(message);
    }
    private String getHtmlText(User user) {
        Context model = new Context();
        model.setVariable("user",user);
        String htmlText = templateEngine.process("mail",model);
        return htmlText;
    }
}
