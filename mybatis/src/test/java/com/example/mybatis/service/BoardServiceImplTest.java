package com.example.mybatis.service;

import com.example.mybatis.dto.BoardDto;
import com.example.mybatis.dto.PageDto;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BoardServiceImplTest {

    @Autowired
    private BoardService boardService;

    @Test
    @DisplayName("게시글 전체 조회")
    void findAll() {
        boardService.findAll().forEach(System.out::println);
    }

    @Test
    @DisplayName("게시글 등록")
    @Transactional
    void save() {
        Long boardId = boardService.save(
            BoardDto.builder()
                .userId(4L)
                .title("title test")
                .content("content test")
                .build()
        );

        System.out.println(boardId);
    }

    @Test
    @DisplayName("게시글 전체 조회 - 페이징 적용")
    void findAllPaging() {

        PageDto pageDto = PageDto.builder().page(3).size(3).build();
        PageHelper.startPage(pageDto.getPage(), pageDto.getSize());
//        boardService.findAllPaging().forEach(System.out::println);
        PageInfo<BoardDto> pageInfo = PageInfo.of(boardService.findAllPaging());

        System.out.println(pageInfo);
    }

}