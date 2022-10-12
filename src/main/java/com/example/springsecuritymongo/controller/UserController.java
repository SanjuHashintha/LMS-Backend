package com.example.springsecuritymongo.controller;

import com.example.springsecuritymongo.service.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.springsecuritymongo.model.User;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/user")
public class UserController {


}
