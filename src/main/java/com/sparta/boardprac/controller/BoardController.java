package com.sparta.boardprac.controller;

import com.sparta.boardprac.dto.BoardRequest;
import com.sparta.boardprac.dto.BoardResponse;
import com.sparta.boardprac.service.BoardService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoardController {

    private final BoardService boardService;

    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    @PostMapping("/api/post")
        public BoardResponse createBoard (@RequestBody BoardRequest boardRequest){
            //return값 없을때  void
            BoardResponse boardResponse = boardService.createBoard(boardRequest);
        return boardResponse;
        }


    }
