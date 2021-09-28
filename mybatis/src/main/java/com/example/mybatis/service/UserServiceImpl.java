package com.example.mybatis.service;

import com.example.mybatis.dto.UserDto;
import com.example.mybatis.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;

    @Override
    public List<UserDto> findAll() {
        return userMapper.findAll();
    }

    @Override
    public UserDto findById(Long id) {
        return userMapper.findById(id);
    }

    @Override
    public String nameCheck(String name) {
        return userMapper.nameCheck(name);
    }

    @Override
    public Long save(UserDto user) {
        int resultNum = userMapper.save(user);

        return user.getId();
    }
}
