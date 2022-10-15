package com.example.springsecuritymongo.repository;


import com.example.springsecuritymongo.model.Enrollment;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface EnrollmentRepository extends MongoRepository <Enrollment, String> {

    Enrollment save(Enrollment enrollment);

    Optional<Enrollment> findByUsername(String username);
    Optional<List<Enrollment>> findAllByUsername(String username);
}
