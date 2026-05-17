package com.tanmay.auth.session_auth.controller;

import com.tanmay.auth.session_auth.dto.CreateUserRequest;
import com.tanmay.auth.session_auth.entity.User;
import com.tanmay.auth.session_auth.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/auth")
@CrossOrigin(origins = "http://localhost:5173") // React Vite
public class AuthController {

    private final UserService service;

    @PostMapping("/register")
    public String register(@RequestBody CreateUserRequest request) {
        service.register(request);
        return "User registered successfully";
    }

    @GetMapping("/user")
    public List<User> getAllUsers() {
        return service.getAllUsers();
    }
    @GetMapping("/home")
    public String home() {
        return "Welcome, you are authenticated!";
    }

}
