package com.example.mybatistest.post.dto;

import com.example.mybatistest.post.domain.Post;

import lombok.Builder;
import lombok.Getter;

@Getter
public class PostResponse {

	private final Long id;
	private final String title;
	private final String content;
	private final String writer;

	@Builder
	private PostResponse(
		Long id,
		String title,
		String content,
		String writer
	) {
		this.id = id;
		this.title = title;
		this.content = content;
		this.writer = writer;
	}

	public static PostResponse toResponse(Post post) {
		return PostResponse.builder()
			.id(post.getId())
			.title(post.getTitle())
			.content(post.getContent())
			.writer(post.getWriter())
			.build();
	}
}
