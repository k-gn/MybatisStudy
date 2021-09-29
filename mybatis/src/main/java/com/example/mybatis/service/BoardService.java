package com.example.mybatis.service;

import com.example.mybatis.dto.BoardDto;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface BoardService {

    List<BoardDto> findAll();

    Long save(BoardDto boardDto);

    Page<BoardDto> findAllPaging();

}
