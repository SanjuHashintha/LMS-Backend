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
@RequestMapping("/api/course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @PostMapping("/dcourse")
    public String dcourse(@RequestBody Course course){
        return  courseService.Dcourse(course);

    }

    @PostMapping("/getAll")
    public ResponseEntity <List<Course>> getCourse(){

        try {
            return new ResponseEntity<>(courseService.getCourse(), HttpStatus.OK) ;
        } catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }

    }

    @GetMapping("/course/{id}")
    public ResponseEntity <Optional<Course>> getCourseById(@PathVariable String id){
        try {
            return new ResponseEntity<>(courseService.getCourseById(id), HttpStatus.OK) ;
        } catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }

    }

 @PostMapping("/add")
 public ResponseEntity<CourseCreateResponse> addCourse(@RequestBody CourseCreateRequest courseRequest){
     try {
         return new ResponseEntity<>(courseService.addCourse(courseRequest), HttpStatus.OK);
     } catch (Exception e){
         return new ResponseEntity<> (null, HttpStatus.INTERNAL_SERVER_ERROR);
     }

 }

    @DeleteMapping("/course/delete/{id}")
    public ResponseEntity <String> deleteCourseById(@PathVariable String id){
        try {
            courseService.deleteCourseById(id);
            return new ResponseEntity<>("Course deleted"+ id, HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity<> (e.getMessage(), HttpStatus.NOT_FOUND);
        }

    }

    @PutMapping("/course/update/{id}")
    public ResponseEntity <Course> updateCourse(@RequestBody Course course, @PathVariable String id){
     Course updateCourse = courseService.updateCourse(course, id);
     return new ResponseEntity<>(updateCourse, HttpStatus.OK);
    }
}



