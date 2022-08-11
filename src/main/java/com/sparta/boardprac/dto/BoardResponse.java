package com.sparta.boardprac.dto;

import java.time.LocalDateTime;

public class BoardResponse {
    //변수
    private String title;
    private String author;
    private String password;
    private String content;

    private String createAt;

    private String modifiedAt;



    //생성자
    public BoardResponse(String title, String author, String password, String content, String createAt, String modifiedAt) {
        this.title = title;
        this.author = author;
        this.password = password;
        this.content = content;
        this.createAt = createAt;
        this.modifiedAt = modifiedAt;
    }
    //메서드
    //Getter
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

    public String getCreateAt() {
        return createAt;
    }

    public String getModifiedAt() {
        return modifiedAt;
    }
}
