package com.example.springsecuritymongo.service;



import com.example.springsecuritymongo.model.Course;
import com.example.springsecuritymongo.model.Enrollment;
import com.example.springsecuritymongo.model.User;
import com.example.springsecuritymongo.repository.CourseRepository;
import com.example.springsecuritymongo.repository.EnrollmentRepository;
import com.example.springsecuritymongo.repository.UserRepository;
import com.example.springsecuritymongo.request.EnrollmentCreateRequest;
import com.example.springsecuritymongo.response.EnrollmentCreateResponse;
import com.example.springsecuritymongo.response.ResponseObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class EnrollmentService {

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private UserRepository userRepository;

    public ResponseEntity addEnrollment(EnrollmentCreateRequest enrollmentCreateRequest){
        Course course = courseRepository.findById(enrollmentCreateRequest.getCourseId()).get();

        User student = userRepository.findById(enrollmentCreateRequest.getUserId()).get();

        Set<User> students = course.getStudents();
        //remove students from course
        course.setStudents(null);
        student.getCourses().add(course);
        userRepository.save(student);

        //remove courses from student
        student.setCourses(null);
        student.setPassword(null);
        students.add(student);
        course.setStudents(students);
        courseRepository.save(course);

        return ResponseEntity.ok(new ResponseObject(
                "00",
                "success",
                "You have successfully enrolled into course"+course.getCourseCode()
        ));

    }


//    @Autowired
//    private EnrollmentRepository enrollmentRepository;
//
//    public EnrollmentCreateResponse addEnrollment(@RequestBody EnrollmentCreateRequest enrollmentCreateRequest){
//        Enrollment enrollment = new Enrollment(null, enrollmentCreateRequest.getUsername(), enrollmentCreateRequest.getCourseCode(), enrollmentCreateRequest.getMark());
//        Enrollment createEnrollment = enrollmentRepository.save(enrollment);
//        return new EnrollmentCreateResponse(createEnrollment);
//    }
//
//    public List<Enrollment> getEnrollment(){return enrollmentRepository.findAll();}
//
//    public Optional<Enrollment> getEnrollmentById(@PathVariable String id){
//        return enrollmentRepository.findById(id);
//    }
//
//    public Optional<List<Enrollment>> getEnrollmentByUsername(@PathVariable String username){
//        return enrollmentRepository.findAllByUsername(username);
//    }


}
