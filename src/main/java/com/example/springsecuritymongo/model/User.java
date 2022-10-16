package com.example.springsecuritymongo.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

@Document(collection = "users")
@Getter
@Setter
@NoArgsConstructor
public class User {
    @Id
    private String id;
    private String username;
    private String email;
    private String password;
//    @DBRef
    private Set<String> roles = new HashSet<>();   //TODO: use Role type

    private Set<Course> courses = new HashSet<>();

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

//    public User(User user){
//        this(user.getId(),user.username,user.getEmail());
//    }

    public User(User user) {
        this.id = user.id;
        this.username = user.username;
        this.email = user.email;
        this.password = user.password;
        this.roles = user.roles;
        this.courses = user.courses;
    }
}
