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
    int userNumber;
    int postNumber;
    int commentNumber;
    int avgPostFor1User;
    int avgCoommentFor1User;
    int avgCommentForPost;





    //  showStatistics()
}
