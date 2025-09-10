package com.StackOverFlow.entities;

public class Vote {
    private final User votedBy;
    private final VoteType voteType;

    public Vote(User votedBy, VoteType voteType) {
        this.votedBy = votedBy;
        this.voteType = voteType;
    }

    public User getVotedBy() {
        return votedBy;
    }

    public VoteType getVoteType() {
        return voteType;
    }
}
