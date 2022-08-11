package com.sparta.boardprac.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Board extends Timestamped {

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String author;
    private String password;
    private String content;

    public Board(String title, String author, String password, String content) {
        this.title = title;
        this.author = author;
        this.password = password;
        this.content = content;

    }
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPassword() {
        return password;
    }

    public String getContent() {
        return content;
    }
}

