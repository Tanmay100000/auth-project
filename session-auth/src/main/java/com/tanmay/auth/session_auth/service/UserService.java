package com.tanmay.auth.session_auth.service;

import com.tanmay.auth.session_auth.dto.CreateUserRequest;
import com.tanmay.auth.session_auth.entity.User;
import com.tanmay.auth.session_auth.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repo;
    private final BCryptPasswordEncoder encoder;

    public User register(CreateUserRequest request) {
        User user = new User();
        user.setUsername(request.getUsername());
        user.setPassword(encoder.encode(request.getPassword()));
        user.setRole("USER");

        return repo.save(user);
    }

    public List<User> getAllUsers() {
        return repo.findAll();
    }
}
