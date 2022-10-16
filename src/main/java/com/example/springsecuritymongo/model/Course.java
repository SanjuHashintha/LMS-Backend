package com.example.springsecuritymongo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashSet;
import java.util.Set;

@Document(collection = "courses")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Course {

    @Id
    private String id;
    private String courseCode;
    private String courseName;
    private String courseDescription;
    private String semester;
    private String year;
    private double marks;

    private User lecturer = null;
    private Set<User> students = new HashSet<>();

//    public Course(Object o, String courseCode, String courseName, String description) {
//
//    }



}
