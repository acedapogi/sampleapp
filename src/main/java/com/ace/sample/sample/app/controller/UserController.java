package com.ace.sample.sample.app.controller;

import com.ace.sample.sample.app.data.User;
import com.ace.sample.sample.app.data.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;



    @GetMapping("/")
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
}
