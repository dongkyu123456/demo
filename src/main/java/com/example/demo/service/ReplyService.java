package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.ReplyEntity;

public interface ReplyService {
    List<ReplyEntity> getAllReplies();
    ReplyEntity getReplyById(Long id);
    List<ReplyEntity> getRepliesByBoardId(Long boardId);
    ReplyEntity createReply(ReplyEntity reply);
    ReplyEntity updateReply(ReplyEntity reply);
    void deleteReply(Long id);
}