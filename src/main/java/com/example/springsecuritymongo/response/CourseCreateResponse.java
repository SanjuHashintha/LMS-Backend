package com.example.springsecuritymongo.response;




import com.example.springsecuritymongo.model.Course;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CourseCreateResponse {

    private Course course;

    public CourseCreateResponse(Course course){
        this.course = course;
    }
}
