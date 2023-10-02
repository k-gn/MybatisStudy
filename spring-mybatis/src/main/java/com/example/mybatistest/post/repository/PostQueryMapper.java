package com.example.mybatistest.post.repository;

import java.util.List;
import java.util.Optional;

import org.apache.ibatis.annotations.Mapper;

import com.example.mybatistest.post.domain.Post;

@Mapper
public interface PostQueryMapper {

	Optional<Post> findById(Long id);

	List<Post> findAll();
}
