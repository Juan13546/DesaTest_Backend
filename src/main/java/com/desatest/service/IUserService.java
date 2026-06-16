package com.desatest.service;

import com.desatest.commons.ICrudCommonsDto;
import com.desatest.dto.UserRequestDto;
import com.desatest.dto.UserResponseDto;
import java.util.List;

public interface IUserService extends ICrudCommonsDto<UserRequestDto, UserResponseDto, Long> {
    List<UserResponseDto> findAll();

}
