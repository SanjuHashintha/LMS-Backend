package com.example.springsecuritymongo.request;

import lombok.*;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SignUpRequest {
    private String username;
    private String email;
    private String firstName;
    private String lastName;
    private String password;
    private Set<String> roles = new HashSet<>();


//    public SignUpRequest(String username, String firstName, String lastName, String email, String password, Set<String> roles) {
//    }
}