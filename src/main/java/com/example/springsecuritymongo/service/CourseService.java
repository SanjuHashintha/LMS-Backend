package com.example.springsecuritymongo.service;


import com.example.springsecuritymongo.model.Course;
import com.example.springsecuritymongo.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {


    @Autowired
    private CourseRepository courseRepository;


    public List<Course> getCourse(){
        return courseRepository.findAll();
    }

    public Optional<Course> getCourseById(@PathVariable String id){
        return courseRepository.findById(id);
    }

    public String deleteCourseById (@PathVariable String id){
        courseRepository.deleteById(id);
        return "Course deleted";
    }

    public Course updateCourse(Course course, @PathVariable String id){
        course.setId(id);
        return courseRepository.save(course);
    }
}
