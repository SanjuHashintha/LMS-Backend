package com.example.springsecuritymongo.controller;


import com.example.springsecuritymongo.service.EmailClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
@CrossOrigin
public class AnnounceController {

    @Autowired
    private EmailClientService service;

    @GetMapping("/user")
    public String GetUser(){
        return "this is get";
    }

    @PostMapping("/sendMail")
    public String sendMail(){
        service.sendSimpleEmail("shehani.9716@gmail.com",
				"content",
				"This is the subject");
        return "mail send...";
    }

}
