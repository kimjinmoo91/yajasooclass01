package com.sparta.boardprac.service;

import com.sparta.boardprac.dto.BoardResponse;
import com.sparta.boardprac.model.Board;
import com.sparta.boardprac.repository.BoardRepository;
import com.sparta.boardprac.dto.BoardRequest;
import org.springframework.stereotype.Service;

@Service
public class BoardService {

    private final BoardRepository boardRepository;

    public BoardService(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    public BoardResponse createBoard(BoardRequest boardRequest) {
        //createBoard를 만들기 위해 boardRequest를 넣었는데 만들려면 꺼내야하고, 꺼낼땐 get으로 꺼낸다.
        String title = boardRequest.getTitle();
        String author = boardRequest.getAuthor();
        String password = boardRequest.getPassword();
        String content = boardRequest.getContent();

        // Board만들기
        Board board = new Board(title, author, password, content);


        //DB만들기
        // -1. @Entity
        // -2. Repository (저장=save)
        Board savedBoard = boardRepository.save(board);

        //boardResponse로 변환하기(만들기)
        //필요 재료 (변수와 이름이 같으면 찾아올 수 없어 다르게 변수명을 정한다)
        String savedTitle = savedBoard.getTitle();
        String savedAuthor = savedBoard.getAuthor();
        String savedPassword = savedBoard.getPassword();
        String savedContent = savedBoard.getContent();
        String savedCreateAt = savedBoard.getCreateAt();
        String savedModifiedAt = savedBoard.getModifiedAt();


        BoardResponse boardResponse = new BoardResponse(savedTitle, savedAuthor, savedPassword, savedContent, savedCreateAt, savedModifiedAt);
        //boardResponse 리턴하기
        return boardResponse;
        //return

    }
}
