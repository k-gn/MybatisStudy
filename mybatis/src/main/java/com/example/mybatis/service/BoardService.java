package com.example.mybatis.service;

import com.example.mybatis.dto.BoardDto;

import java.util.List;

public interface BoardService {

    List<BoardDto> findAll();

    Long save(BoardDto boardDto);

}
