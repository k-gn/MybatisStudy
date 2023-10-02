package com.example.mybatistest.post.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.mybatistest.post.repository.PostCommendMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@Transactional
public class PostCommendService {

	private final PostCommendMapper postCommendMapper;


}
