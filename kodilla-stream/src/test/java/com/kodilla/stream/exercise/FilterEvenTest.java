package com.kodilla.stream.exercise;

import org.junit.Before;
import org.junit.Test;


import java.util.ArrayList;
import java.util.List;

import com.kodilla.stream.exercise.*;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class FilterEvenTest{
    @Before
    public void before() {
        System.out.println("Test start: EvenList");
    }

    @Test
    public void testFilterEven() {
        ArrayList<Integer> test1 = new ArrayList<>();
        test1.add(3);
        test1.add(4);
        test1.add(5);
        test1.add(6);
        test1.add(7);

        FilterEven exterm1 = new FilterEven();
        List<Integer> results = new ArrayList<>();
        results = exterm1.filter(test1);

        Assert.assertEquals(2, results.size());

    }
    @After
    public void after(){
        System.out.println("Test end: EmptyList");
    }
}




