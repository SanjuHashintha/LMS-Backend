package com.example.springsecuritymongo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    @GetMapping("/home")
    public String getHome() {
        return "This is home page";
    }

    @GetMapping("/dashboard")
    public String getDashboard() {
        return "This is dashboard page";
    }

    @GetMapping("/manage")
    public String getManage() {
        return "This is manage page";
    }
}
