package com.example.mybatis.mapper;

import com.example.mybatis.dto.BoardDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {

    List<BoardDto> findAll();

    Long save(BoardDto boardDto);
}
