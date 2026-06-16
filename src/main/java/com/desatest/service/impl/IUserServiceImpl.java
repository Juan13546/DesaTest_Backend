package com.desatest.service.impl;

import com.desatest.dto.UserRequestDto;
import com.desatest.dto.UserResponseDto;
import com.desatest.mapper.UserMapper;
import com.desatest.model.UserEntity;
import com.desatest.repository.IUserRepository;
import com.desatest.service.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IUserServiceImpl implements IUserService {

    private final IUserRepository iUserRepository;
    private final UserMapper userMapper;

    @Override
    public List<UserResponseDto> findAll() {
        List<UserEntity> users = iUserRepository.findAll();
        return userMapper.toDtoList(users);
    }

    @Override
    public UserResponseDto save(UserRequestDto userDto) {
        UserEntity entity = userMapper.toEntity(userDto);
        UserEntity userSaved = iUserRepository.save(entity);
        return userMapper.toDto(userSaved);
    }

    @Override
    public UserResponseDto update(Long aLong, UserRequestDto entity) {
        return null;
    }

    @Override
    public UserResponseDto finById(Long aLong) {
        return null;
    }

    @Override
    public UserResponseDto delete(Long aLong) {
        return null;
    }
}
