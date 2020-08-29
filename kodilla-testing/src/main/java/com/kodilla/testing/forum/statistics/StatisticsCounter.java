package com.kodilla.testing.forum.statistics;

import java.util.List;

public class StatisticsCounter {

    public StatisticsCounter(Statistics statisticsMock) {
    }

    public StatisticsCounter() {

    }

    public void calculateAdvStatistics(Statistics statistics){
        userNumber = statistics.usersNames().size();
        postNumber = statistics.postsCount();
        commentNumber = statistics.commentsCount();

        //avgPostFor1User = (statistics.postsCount()/statistics.usersNames().size());
        if(userNumber!=0) {
            avgPostFor1User = (postNumber / userNumber);
            avgCoommentFor1User = (commentNumber / userNumber);
        }
        if(postNumber!=0)
        avgCommentForPost = (commentNumber / postNumber);


    }

    // List<String> usersNames()
    private int userNumber;
    private int postNumber;
    private int commentNumber;
    private int avgPostFor1User;
    private int avgCoommentFor1User;
    private int avgCommentForPost;

    public int getUserNumber() {
        return userNumber;
    }

    public int getPostNumber() {
        return postNumber;
    }

    public int getCommentNumber() {
        return commentNumber;
    }

    public int getAvgPostFor1User() {
        return avgPostFor1User;
    }

    public int getAvgCoommentFor1User() {
        return avgCoommentFor1User;
    }

    public int getAvgCommentForPost() {
        return avgCommentForPost;
    }


    //  showStatistics()
}
