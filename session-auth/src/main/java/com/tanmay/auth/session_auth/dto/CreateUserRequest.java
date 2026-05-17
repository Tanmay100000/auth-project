package com.tanmay.auth.session_auth.dto;

import lombok.Data;

@Data
public class CreateUserRequest {
    private Long id;
    private String username;
    private String password;
    private String  role;
}
