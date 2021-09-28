package com.example.mybatis.service;

import com.example.mybatis.dto.UserDto;

import java.util.List;

public interface UserService {

    List<UserDto> findAll();

    UserDto findById(Long id);

    String nameCheck(String name);

    Long save(UserDto user);
}
