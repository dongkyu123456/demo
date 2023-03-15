package com.example.demo.entity;

import lombok.*;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class BoardEntity {
    private Long id;
    private String title;
    private String nickname;
    private LocalDateTime regDate;
    private int views;
    private int likes;
    private String content;
    private List<ReplyEntity> replies;
}