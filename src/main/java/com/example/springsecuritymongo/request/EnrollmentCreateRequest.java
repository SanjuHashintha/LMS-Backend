package com.example.springsecuritymongo.request;


import lombok.*;
import org.springframework.stereotype.Component;

@Component
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EnrollmentCreateRequest {

    private String userId;
    private String courseId;
    private double mark;

}
