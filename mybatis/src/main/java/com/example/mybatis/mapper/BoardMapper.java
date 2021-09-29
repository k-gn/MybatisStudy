package com.example.mybatis.mapper;

import com.example.mybatis.dto.BoardDto;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {

    List<BoardDto> findAll();

    Page<BoardDto> findAllPaging();

    Long save(BoardDto boardDto);
}
