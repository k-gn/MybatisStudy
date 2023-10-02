package com.example.mybatistest.post.repository;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PostCommendMapper {

	int save();

	int update();

	int delete();
}
