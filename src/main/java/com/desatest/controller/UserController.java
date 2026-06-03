package com.desatest.controller;

import com.desatest.dto.UserResponseDto;
import com.desatest.service.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final IUserService iUserService;

    @GetMapping
    public ResponseEntity<List<UserResponseDto>> getAll(){
        return ResponseEntity.status(HttpStatus.OK).body(iUserService.findAll());
    }
}
