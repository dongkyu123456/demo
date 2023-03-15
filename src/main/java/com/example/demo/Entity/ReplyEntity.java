package com.example.demo.Entity;

import lombok.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class ReplyEntity {
    private Long id;
    private String nickname;
    private String content;
    private LocalDateTime regDate;
    private Long boardId;
}