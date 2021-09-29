package com.example.mybatis.service;

import com.example.mybatis.dto.BoardDto;
import com.example.mybatis.mapper.BoardMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {

    private final BoardMapper boardMapper;

    @Override
    public List<BoardDto> findAll() {
        return boardMapper.findAll();
    }

    @Override
    public Long save(BoardDto boardDto) {
        boardMapper.save(boardDto);
        return boardDto.getBoardId();
    }

    @Override
    public Page<BoardDto> findAllPaging() {
        return boardMapper.findAllPaging();
    }

}
