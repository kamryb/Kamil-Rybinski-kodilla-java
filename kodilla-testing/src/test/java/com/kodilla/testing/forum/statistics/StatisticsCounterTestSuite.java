package com.kodilla.testing.forum.statistics;


import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import static org.mockito.Mockito.*;


public class StatisticsCounterTestSuite {

    @Test
    public void testStatisticCounter() {

        //Given

        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNamesList = new ArrayList<>();
        usersNamesList.add("Adam");
        usersNamesList.add("Adrian");
        usersNamesList.add("Aleksander");
        usersNamesList.add("Andrzej");
        when(statisticsMock.usersNames()).thenReturn(usersNamesList);

        StatisticsCounter statisticsCounter = new StatisticsCounter();


        //When
        statisticsCounter.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(4, statisticsCounter.userNumber);

    }
}
