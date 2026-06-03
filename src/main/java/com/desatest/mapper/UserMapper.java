package com.desatest.mapper;

import com.desatest.dto.UserRequestDto;
import com.desatest.dto.UserResponseDto;
import com.desatest.model.UserEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserMapper {

    public UserResponseDto toDto(UserEntity entity){
        return UserResponseDto.builder()
                .codUser(entity.getCodUser())
                .nomUser(entity.getNomUser())
                .numDocum(entity.getNumDocum())
                .apePaterno(entity.getApePaterno())
                .apeMaterno(entity.getApeMaterno())
                .codSex(entity.getCodSex())
                .address(entity.getAddress())
                .build();
    }

    public List<UserResponseDto> toDtoList(List<UserEntity> entities){
        return entities.stream()
                .map(this::toDto)
                .toList();
    }

}
