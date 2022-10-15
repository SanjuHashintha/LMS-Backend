package com.example.springsecuritymongo.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "courses")
@Getter
@Setter
@NoArgsConstructor
public class Course {
    @Id
    private String id;
    private String courseCode;
    private String courseName;
    private String courseDescription;

    public Course(Object o, String courseCode, String courseName, String description) {
    }
}
