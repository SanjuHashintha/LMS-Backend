package com.example.springsecuritymongo.response;



import com.example.springsecuritymongo.model.Enrollment;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EnrollmentCreateResponse {

    private Enrollment enrollment;

    public EnrollmentCreateResponse(Enrollment enrollment) {
        this.enrollment = enrollment;
    }

}
