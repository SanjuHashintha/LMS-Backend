package com.LMS.contoller;


import com.LMS.model.User;
import com.LMS.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/add")
    public User getUser(){
        User user = new User(null,"Lasith");
        userService.addUser(user);
        return user;
    }
}
