package com.tanmay.auth.session_auth.controller;

import com.tanmay.auth.session_auth.entity.User;
import com.tanmay.auth.session_auth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = "http://localhost:5173") // React Vite
public class AuthController {

    @Autowired
    private UserService service;

    @PostMapping("/register")
    public String register(@RequestBody User user) {
        service.register(user);
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
