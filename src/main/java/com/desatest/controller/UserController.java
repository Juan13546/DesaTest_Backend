package com.desatest.controller;

import com.desatest.dto.UserRequestDto;
import com.desatest.dto.UserResponseDto;
import com.desatest.service.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public ResponseEntity<UserResponseDto> save(@RequestBody UserRequestDto userDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(iUserService.save(userDto));
    }
}
