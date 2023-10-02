package com.example.mybatistest.dummy;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.example.mybatistest.post.repository.PostCommendMapper;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class DummyInitializer implements ApplicationRunner {

	private final PostCommendMapper postCommendMapper;

	@Override
	public void run(ApplicationArguments args) throws Exception {

	}
}
