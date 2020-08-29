package com.kodilla.testing.forum.statistics;


import org.junit.Assert;


import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import static org.mockito.Mockito.*;
import static org.junit.Assert.assertTrue;

public class StatisticsCounterTestSuite {

    @Test
    // 1 - number of post = 0
    public void testPostNumber0() {

        //Given

        Statistics statisticsMock = mock(Statistics.class);
        int postsCountTest = 0;
        when(statisticsMock.postsCount()).thenReturn(postsCountTest);

        StatisticsCounter statisticsCounter = new StatisticsCounter();


        //When
        statisticsCounter.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0, statisticsCounter.getPostNumber());

    }

    @Test
    // 2 - number of post = 1000
    public void testPostNumber1000() {

        //Given

        Statistics statisticsMock = mock(Statistics.class);
        int postsCountTest = 1000;
        when(statisticsMock.postsCount()).thenReturn(postsCountTest);

        StatisticsCounter statisticsCounter = new StatisticsCounter();


        //When
        statisticsCounter.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(1000, statisticsCounter.getPostNumber());

    }




    @Test
    // 3 - number of comments = 0
    public void testCommentsCount0() {

        //Given

        Statistics statisticsMock = mock(Statistics.class);
        int commentsCount = 0;
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);

        StatisticsCounter statisticsCounter = new StatisticsCounter();


        //When
        statisticsCounter.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0, statisticsCounter.getCommentNumber());

    }

    @Test
    //4 number of comments < number of posts
    public void testCommentsLessPosts() {

        //Given

        Statistics statisticsMock = mock(Statistics.class);
        int commentsCount = 1;
        int postsCountTest = 10;
        when(statisticsMock.postsCount()).thenReturn(postsCountTest);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);

        StatisticsCounter statisticsCounter = new StatisticsCounter();


        //When
        boolean result;
        statisticsCounter.calculateAdvStatistics(statisticsMock);
        if(statisticsCounter.getCommentNumber()<statisticsCounter.getPostNumber()){
            result =true;
        }
        else {
            result=false;
        }
        //Then
        Assert.assertTrue(result);
    }


    @Test
    //5 number of comments < number of posts
    public void testCommentsMorePosts() {

        //Given

        Statistics statisticsMock = mock(Statistics.class);
        int commentsCount = 10;
        int postsCountTest = 1;
        when(statisticsMock.postsCount()).thenReturn(postsCountTest);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        StatisticsCounter statisticsCounter = new StatisticsCounter();


        //When
        boolean result;
        statisticsCounter.calculateAdvStatistics(statisticsMock);
        if(statisticsCounter.getCommentNumber()>statisticsCounter.getPostNumber()){
            result =true;
        }
        else {
            result=false;
        }
        //Then
        Assert.assertTrue(result);
    }

    @Test
    public void testUserNumber0() {
        //6 - number of user = 0
        //Given

        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNamesList = new ArrayList<>();

        when(statisticsMock.usersNames()).thenReturn(usersNamesList);

        StatisticsCounter statisticsCounter = new StatisticsCounter();


        //When
        statisticsCounter.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0, statisticsCounter.getUserNumber());

    }



    @Test
    public void testUserNumber100() {
    //7 - number of user = 100
        //Given

        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNamesList = new ArrayList<>();
        for(int i=0; i<100; i++){
            String user="User"+i;
            usersNamesList.add(user);
        }

        when(statisticsMock.usersNames()).thenReturn(usersNamesList);

        StatisticsCounter statisticsCounter = new StatisticsCounter();


        //When
        statisticsCounter.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(100, statisticsCounter.getUserNumber());

    }
}
