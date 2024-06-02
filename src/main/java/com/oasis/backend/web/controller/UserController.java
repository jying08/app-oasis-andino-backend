package com.oasis.backend.web.controller;

import com.oasis.backend.domain.User;
import com.oasis.backend.domain.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    public List<User> getAll()
    {
        return userService.getAll();
    }

    public Optional<List<User>> getByEmail(String emailId){
        return userService.getByEmail(emailId);
    }

    public Optional<User> getUser(int userId){
        return userService.getUser(userId);
    }

    public User save(User user){
        return userService.save(user);
    }

    public boolean delete(int userId){
        return userService.delete(userId);
    }
}
