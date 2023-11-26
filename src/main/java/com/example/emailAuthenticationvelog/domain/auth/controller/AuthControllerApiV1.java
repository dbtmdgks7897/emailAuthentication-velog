package com.example.emailAuthenticationvelog.domain.auth.controller;


import com.example.emailAuthenticationvelog.domain.auth.dto.ReqAuthenticateCodeApiV1DTO;
import com.example.emailAuthenticationvelog.domain.auth.dto.ReqSendEmailAuthenticationApiV1DTO;
import com.example.emailAuthenticationvelog.domain.auth.service.AuthServiceApiV1;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/auth")
public class AuthControllerApiV1 {

    private final AuthServiceApiV1 authServiceApiV1;

    // 이메일 인증 번호 요청
    @PostMapping("/email-authentication")
    public HttpEntity<?> sendEmailAuthentication(
            @RequestBody ReqSendEmailAuthenticationApiV1DTO reqSendEmailAuthenticationApiV1DTO) {
        return authServiceApiV1.sendEmailAuthentication(reqSendEmailAuthenticationApiV1DTO);
    }

    // 인증 번호 검증
    @PostMapping("/authentication-code")
    public HttpEntity<?> authenticateCode(@RequestBody ReqAuthenticateCodeApiV1DTO reqAuthenticateCodeApiV1DTO) {
        return authServiceApiV1.authenticateCode(reqAuthenticateCodeApiV1DTO);
    }
}
