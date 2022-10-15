package com.example.springsecuritymongo.service;



import com.example.springsecuritymongo.model.Enrollment;
import com.example.springsecuritymongo.repository.EnrollmentRepository;
import com.example.springsecuritymongo.request.EnrollmentCreateRequest;
import com.example.springsecuritymongo.response.EnrollmentCreateResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class EnrollmentService {
    @Autowired
    private EnrollmentRepository enrollmentRepository;

    public EnrollmentCreateResponse addEnrollment(@RequestBody EnrollmentCreateRequest enrollmentCreateRequest){
        Enrollment enrollment = new Enrollment(null, enrollmentCreateRequest.getUsername(), enrollmentCreateRequest.getCourseCode(), enrollmentCreateRequest.getMark());
        Enrollment createEnrollment = enrollmentRepository.save(enrollment);
        return new EnrollmentCreateResponse(createEnrollment);
    }

    public List<Enrollment> getEnrollment(){return enrollmentRepository.findAll();}

    public Optional<Enrollment> getEnrollmentById(@PathVariable String id){
        return enrollmentRepository.findById(id);
    }

    public Optional<List<Enrollment>> getEnrollmentByUsername(@PathVariable String username){
        return enrollmentRepository.findAllByUsername(username);
    }


}
