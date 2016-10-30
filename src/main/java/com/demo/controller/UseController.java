package com.demo.controller;

import com.demo.model.User;
import com.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Pinggang Yu on 2016/10/28.
 */
@RestController
public class UseController {
    @Autowired
    private UserService userService;

    @RequestMapping("/users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
    @RequestMapping("/user")
    public User getUser() {
        return userService.getUser(2);
    }
}
