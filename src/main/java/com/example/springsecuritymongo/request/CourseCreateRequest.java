package com.example.springsecuritymongo.request;

import lombok.*;
import org.springframework.stereotype.Component;

@Component
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CourseCreateRequest {

    private String id;
    private String courseCode;
    private String courseName;
    private String courseDescription;
    private String semester;
    private String year;
    private double marks;
    private String lecturerId;


    public CourseCreateRequest(String courseCode, String courseName, String description) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.courseDescription = description;
    }
}
