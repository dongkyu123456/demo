package com.example.demo.service;

import com.example.demo.entity.BoardEntity;

import java.util.List;

public interface BoardService {
    BoardEntity save(BoardEntity board);
    BoardEntity findById(Long id);
    List<BoardEntity> findAll();
    void deleteById(Long id);
}