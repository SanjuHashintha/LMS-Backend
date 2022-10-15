package com.LMS.contoller;


import com.LMS.service.EmailClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
@CrossOrigin
public class UserController {

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
