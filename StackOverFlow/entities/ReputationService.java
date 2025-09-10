package com.StackOverFlow.entities;

public class ReputationService {

    public static void handleVote(Content content, Vote vote) {
        int delta = 0;
        switch(vote.getVoteType()){
            case UPVOTE:
                delta = (content instanceof Answer) ? 10 : 5;
                break;
            case DOWNVOTE:
                delta -=2;
                break;
        }

        content.getCreatedBy().increaseReputation(delta);
    }
}
