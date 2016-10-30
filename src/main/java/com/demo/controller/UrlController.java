package com.demo.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import org.springframework.ui.Model;

/**
 * Created by Pinggang Yu on 2016/10/29.
 */
@Controller
public class UrlController {
    @RequestMapping("/")
    public String home() {
        return "index";
    }
    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }
    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/test")
    public String test() {
        return "test";
    }


    @RequestMapping("/ptt")
    public String redirect() {
        return "forward:publictest.html";
    }
}
