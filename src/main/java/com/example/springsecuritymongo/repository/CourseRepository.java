package com.example.springsecuritymongo.repository;

import com.example.springsecuritymongo.model.Course;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CourseRepository extends MongoRepository<Course, String> {
}
