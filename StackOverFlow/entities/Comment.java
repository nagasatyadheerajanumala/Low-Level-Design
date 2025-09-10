package com.StackOverFlow.entities;

public class Comment {
    private final String id;
    private final User commentedBy;
    private final String text;

    public Comment(String id, User commentedBy, String text) {
        this.id = id;
        this.commentedBy = commentedBy;
        this.text = text;
    }
}
