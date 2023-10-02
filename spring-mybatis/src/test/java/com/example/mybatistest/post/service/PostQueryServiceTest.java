package com.example.mybatistest.post.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PostQueryServiceTest {

	@Autowired
	private PostQueryService postQueryService;

	@Test
	void test() {
		postQueryService.findAll();
	}
}