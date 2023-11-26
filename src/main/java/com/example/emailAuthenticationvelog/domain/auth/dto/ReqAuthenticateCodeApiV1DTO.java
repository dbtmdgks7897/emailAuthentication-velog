package com.example.emailAuthenticationvelog.domain.auth.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ReqAuthenticateCodeApiV1DTO {

    private String email;
    
    private String code;
}
