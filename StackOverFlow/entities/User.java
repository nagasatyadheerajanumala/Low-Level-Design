package com.StackOverFlow.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class User {
    private final String userId;
    private String name;
    private int reputation;

    private List<Question> questions;
    private List<Answer> answerList;
    private List<Comment> commentList;

    public User(String userId, String name) {
        this.userId = userId;
        this.name = name;
        this.reputation = 0;
        questions = new ArrayList<>();
        answerList = new ArrayList<>();
        commentList = new ArrayList<>();
    }

    public int getReputation() {
        return reputation;
    }

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public void increaseReputation(int points) {
        this.reputation += points;
    }

    public void postQuestion(String title, String body, List<Tag> tags){
        Question q = new Question(UUID.randomUUID().toString(), this, title, body, tags);
        questions.add(q);
        System.out.println(name + "posted a new question: " + title);
    }

    public void postAnswer(Question question, String body) {
        Answer answer = new Answer(UUID.randomUUID().toString(), this, body, question);
        answerList.add(answer);
        System.out.println(name + " answered question " + question.getTitle());
    }

    public void commentOn(Content content, String text) {
        Comment comment = new Comment(UUID.randomUUID().toString(), this, text);
        commentList.add(comment);
        content.addComment(comment);
    }


    public void vote(Content content, VoteType type) {
        Vote vote = new Vote(this, type);
        content.addVote(vote);
    }
}
