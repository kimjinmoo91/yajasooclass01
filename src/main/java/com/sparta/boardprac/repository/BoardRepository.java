package com.sparta.boardprac.repository;

import com.sparta.boardprac.model.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
