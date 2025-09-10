package com.StackOverFlow.entities;

import java.util.ArrayList;
import java.util.List;

public class Question implements Content{
    private final String id;
    private final User createdBy;
    private final String title;
    private final String body;
    private final List<Tag> tags;
    private final List<Answer> answerList;
    private final List<Comment> commentList;
    private final List<Vote> votes;

    public Question(String id, User createdBy, String title, String body, List<Tag> tags) {
        this.id = id;
        this.createdBy = createdBy;
        this.title = title;
        this.body = body;
        this.tags = tags;
        answerList = new ArrayList<>();
        this.commentList = new ArrayList<>();
        this.votes = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public User getCreatedBy() {
        return createdBy;
    }

    public void addAnswer(Answer answer) {
        this.answerList.add(answer);
    }

    public void addComment(Comment comment) {
        this.commentList.add(comment);
    }

    public void addVote(Vote vote) {
        votes.add(vote);
        ReputationService.handleVote(this, vote);
    }
}
