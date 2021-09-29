package com.example.mybatis.service;

import com.example.mybatis.dto.UserDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserServiceImplTest {

    @Autowired
    private UserService userService;

    @Test
    void findAll() {
        List<UserDto> users = userService.findAll();
        users.forEach(System.out::println);
    }

    @Test
    void save() {
        Long resultNum = userService.save(
                UserDto.builder()
                        .name("user3")
                        .age(25)
                        .build()
        );

        assertThat(resultNum).isEqualTo(5);
    }
}