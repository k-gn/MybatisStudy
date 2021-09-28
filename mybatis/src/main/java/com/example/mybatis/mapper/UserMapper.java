package com.example.mybatis.mapper;

import com.example.mybatis.dto.UserDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    List<UserDto> findAll();

    UserDto findById(Long id);

    String nameCheck(String name);

    int save(UserDto user);
}
