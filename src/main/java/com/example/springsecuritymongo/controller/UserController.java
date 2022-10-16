package com.example.springsecuritymongo.controller;

import com.example.springsecuritymongo.repository.UserRepository;
import com.example.springsecuritymongo.service.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.springsecuritymongo.model.User;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/user")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/getAll")
    private List<User> getAll(){
        return userRepository.findAll();
    }

}
