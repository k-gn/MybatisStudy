package com.example.mybatistest.post.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.mybatistest.post.domain.Post;
import com.example.mybatistest.post.repository.PostQueryMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class PostQueryService {

	private final PostQueryMapper postQueryMapper;

	public void findAll() {
		List<Post> posts = postQueryMapper.findAll();
		posts.forEach(post -> {
			System.out.println(post.getId());
			System.out.println(post.getTitle());
			System.out.println(post.getContent());
			System.out.println(post.getWriter());
		});
	}
}
