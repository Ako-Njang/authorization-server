package com.ngai.auth.model.dto;

import lombok.Builder;
import lombok.Data;

@Builder
public class RegisterResponseDto {
    private String name;
    private String tel;
    private String username;
}
