package com.example.demo.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

    // @RestController("/list") // 레스트 컨트롤러는 문자열을 리턴받을 수 있다.
    @SpringBootApplication
    @RestController
    public class BoardController{
        @GetMapping({"/",""})
        public String index() {
            return "board/board";
        }
        @GetMapping("/{food}")
        public String foodgal() {
            return "board/board/food";
        }
        @GetMapping("/{game}")
        public String gamegal() {
            return "board/board/game";
        }    
        @GetMapping("/{music}")
        public String musicgal() {
            return "board/board/music";
        }
        @GetMapping("/{movie}")
        public String moviegal() {
            return "board/board/movie";
        }
        @GetMapping("/{today}")
        public String todaygal() {
            return "board/board/today";
        }
        public static void main(String[] args) {
            SpringApplication.run(BoardController.class, args);
        }
    }
    //참조 사이트 https://velog.io/@ansalstmd/SPRING-REST-Controller%EB%A5%BC-%ED%86%B5%ED%95%9C-%EA%B2%8C%EC%8B%9C%ED%8C%90-%EA%B8%B0%EB%8A%A5-%EA%B5%AC%ED%98%84
    //도와준 친구 : 챗지피티(중괄호 넣는 건 내가 햇음)
