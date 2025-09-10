package com.StackOverFlow.entities;

public interface Content {
    User getCreatedBy();
    void addVote(Vote vote);
    void addComment(Comment comment);
}
