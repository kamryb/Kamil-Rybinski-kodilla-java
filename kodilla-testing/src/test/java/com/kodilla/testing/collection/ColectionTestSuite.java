package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class ColectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test start: NormalList");
    }
   @Test
    public void testOddNumbersExterminatorNormalList(){
        ArrayList<Integer> test1 = new ArrayList<>();
       test1.add(3);
       test1.add(4);
        test1.add(5);
        test1.add(6);
        test1.add(7);

        OddNumbersExterminator exterm1 = new OddNumbersExterminator();
        ArrayList<Integer> result = new ArrayList<>();
        result = exterm1.exterminate(test1);

        Assert.assertEquals(2,result.size());

           }



    @Test
    public void testOddNumbersExterminatorEmptyList(){
        ArrayList<Integer> test2 = new ArrayList<>();


        OddNumbersExterminator exterm2 = new OddNumbersExterminator();
        ArrayList<Integer> result = new ArrayList<>();
        result = exterm2.exterminate(test2);

        Assert.assertEquals(0,result.size());

    }

    @After
    public void after(){
        System.out.println("Test end: EmptyList");
    }

}
