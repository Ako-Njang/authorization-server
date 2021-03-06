package com.ngai.auth.services.register;

import com.ngai.auth.model.dto.LoginResponseDto;
import com.ngai.auth.model.dto.RegisterRequestDto;
import com.ngai.auth.model.dto.RegisterResponseDto;
import com.ngai.auth.services.custom.ApiException;
import org.springframework.stereotype.Service;

public interface IRegistrationService {
    public RegisterResponseDto register(RegisterRequestDto registerRequestDto) throws  Exception;
    public LoginResponseDto refreshToken(String refreshToken);
}
