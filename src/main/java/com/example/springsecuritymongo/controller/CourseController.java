package com.example.springsecuritymongo.controller;



import com.example.springsecuritymongo.model.Course;
import com.example.springsecuritymongo.request.CourseCreateRequest;
import com.example.springsecuritymongo.response.CourseCreateResponse;
import com.example.springsecuritymongo.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class CourseController {

    @Autowired
 private CourseService courseService;

 @PostMapping("/course/add")
 public ResponseEntity<CourseCreateResponse> addCourse(@RequestBody CourseCreateRequest courseRequest){
     try {
         return new ResponseEntity<>(courseService.addCourse(courseRequest), HttpStatus.OK);
     } catch (Exception e){
         return new ResponseEntity<> (null, HttpStatus.INTERNAL_SERVER_ERROR);
     }

 }

}
