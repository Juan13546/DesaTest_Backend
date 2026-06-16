package com.desatest.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserRequestDto {
    private Long codUser;
    private String numDocum;
    private String nomUser;
    private String apePaterno;
    private String apeMaterno;
    private Long codSex;
    private String address;
}
