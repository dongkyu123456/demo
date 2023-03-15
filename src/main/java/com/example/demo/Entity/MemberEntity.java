package com.example.demo.Entity;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class MemberEntity {
    private Long id;
    private String nickname;
    private String password;
    private String email;
}