package com.test;

import com.demo.Application;
import com.demo.model.User;
import com.demo.service.MailService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Pinggang Yu on 2016/10/30.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class TestMail {
    @Autowired
    private MailService mailService;

    @Test
    public void testSendMail() {
        if (mailService == null)
            System.out.println("NULL");
        mailService.sendMail(new User(1, "NO.1"));
    }
}
