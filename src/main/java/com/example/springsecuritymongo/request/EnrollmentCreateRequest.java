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
public class EnrollmentCreateRequest {
    private String id;
    private String username;
    private String courseCode;
    private double mark;

    public EnrollmentCreateRequest(String id, String username, String courseCode, double mark) {
        this.id = id;
        this.username = username;
        this.courseCode = courseCode;
        this.mark = mark;
    }


}
