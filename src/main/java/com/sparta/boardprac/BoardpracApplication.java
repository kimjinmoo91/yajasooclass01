package com.sparta.boardprac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class BoardpracApplication {

    public static void main(String[] args) {
        SpringApplication.run(BoardpracApplication.class, args);
    }

}
