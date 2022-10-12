package com.example.springsecuritymongo.request;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Data
public class LoginRequest {
    private String username;
    private String password;
}
