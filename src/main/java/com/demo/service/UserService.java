package com.demo.service;

import com.demo.dao.UserDao;
import com.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Pinggang Yu on 2016/10/28.
 */
public interface UserService {
    List<User> getAllUsers();
    User getUser(int id);
}
