package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.MemberEntity;

public interface MemberService {
    List<MemberEntity> getAllMembers();
    MemberEntity getMemberById(Long id);
    MemberEntity createMember(MemberEntity member);
    MemberEntity updateMember(MemberEntity member);
    void deleteMember(Long id);
}
