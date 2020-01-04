package com.configuration.security.dto;

import lombok.Data;

@Data
public class SignInRequestDto {
    private String userName;
    private String password;
}
