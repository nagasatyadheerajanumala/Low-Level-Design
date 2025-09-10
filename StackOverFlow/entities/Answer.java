package com.StackOverFlow.entities;

import java.util.ArrayList;
import java.util.List;

public class Answer implements Content{
    private final String id;
    private final User createdBy;
    private final String body;
    private final Question question;
    private final List<Comment> commentList;
    private final List<Vote> voteList;

    public Answer(String id, User createdBy, String body, Question question) {
        this.id = id;
        this.createdBy = createdBy;
        this.body = body;
        this.question = question;
        this.commentList = new ArrayList<>();
        this.voteList = new ArrayList<>();
    }

    public User getCreatedBy() {
        return this.createdBy;
    }

    public void addComment(Comment comment) {
        this.commentList.add(comment);
    }

    public void addVote(Vote vote){
        voteList.add(vote);
        ReputationService.handleVote(this, vote);
    }
}
