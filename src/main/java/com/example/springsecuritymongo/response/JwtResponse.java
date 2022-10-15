package com.example.springsecuritymongo.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JwtResponse {
    private String token;
//    private String type;
    private String id;
    private String username;
    private String email;
    private List<String> roles;
}
