package com.example.springsecuritymongo.request;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Data
@Getter
@Setter
@NoArgsConstructor
public class CourseCreateRequest {

    private String courseCode;
    private String courseName;
    private String description;


    public CourseCreateRequest(String courseCode, String courseName, String description) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.description = description;
    }
}
