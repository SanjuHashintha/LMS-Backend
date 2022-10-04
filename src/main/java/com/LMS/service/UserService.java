package com.LMS.service;

import com.LMS.model.User;
import com.LMS.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public User addUser(User user) {

        return userRepository.save(user);

    }

}
