package com.example.springsecuritymongo.controller;

import com.example.springsecuritymongo.request.EnrollmentCreateRequest;
import com.example.springsecuritymongo.response.EnrollmentCreateResponse;
import com.example.springsecuritymongo.service.EnrollmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/enrollment")
public class EnrollmentController {

    @Autowired
    private EnrollmentService enrollmentService;


    @PostMapping("/addEnrollment")
    private ResponseEntity addEnrollment(@RequestBody EnrollmentCreateRequest enrollmentCreateRequest){
        return enrollmentService.addEnrollment(enrollmentCreateRequest);
    }

}
