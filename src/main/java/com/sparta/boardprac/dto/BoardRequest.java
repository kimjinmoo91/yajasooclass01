package com.sparta.boardprac.dto;

public class BoardRequest {

    //변수 체크
    private String title;
    private String author;
    private String password;
    private String content;



    //생성자
    public BoardRequest(String title, String author, String password, String content) {

        this.title = title;
        this.author = author;
        this.password = password;
        this.content = content;
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
}