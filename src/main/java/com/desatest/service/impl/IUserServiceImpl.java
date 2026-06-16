package com.desatest.service.impl;

import com.desatest.dto.UserRequestDto;
import com.desatest.dto.UserResponseDto;
import com.desatest.mapper.UserMapper;
import com.desatest.model.UserEntity;
import com.desatest.repository.IUserRepository;
import com.desatest.service.IUserService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.StoredProcedureQuery;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IUserServiceImpl implements IUserService {

    private final IUserRepository iUserRepository;
    private final UserMapper userMapper;
    private final EntityManager entityManager;

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
    public UserResponseDto update(Long id, UserRequestDto userDto) {

        StoredProcedureQuery sp =
                entityManager.createNamedStoredProcedureQuery("UserEntity.updateUser");
        sp.setParameter("pc_cod_user", id);
        sp.setParameter("pc_num_docum", userDto.getNumDocum());
        sp.setParameter("pc_nom_user", userDto.getNomUser());
        sp.setParameter("pc_ape_paterno", userDto.getApePaterno());
        sp.setParameter("pc_ape_materno", userDto.getApeMaterno());
        sp.setParameter("pc_cod_sex", userDto.getCodSex());
        sp.setParameter("pc_address", userDto.getAddress());

        sp.execute();

        return UserResponseDto.builder()
                .codUser(id)
                .numDocum(userDto.getNumDocum())
                .nomUser(userDto.getNomUser())
                .apePaterno(userDto.getApePaterno())
                .apeMaterno(userDto.getApeMaterno())
                .codSex(userDto.getCodSex())
                .address(userDto.getAddress())
                .build();
    }

    @Override
    public UserResponseDto finById(Long id) {
        return null;
    }

    @Override
    public UserResponseDto delete(Long id) {
        return null;
    }
}
