package com.kodilla.patterns.singleton;


import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {
    private static Logger logger;

    @BeforeClass
    public static void createLog(){
        Logger.getInstance().log("FirstLog");
    }

    @Test
    public void testgetLastLog(){

        //Given
        //When
        String logg = Logger.getInstance().getLastlog();
        System.out.println("Last log is:" + logg);
        //Then
        Assert.assertEquals(logg, "FirstLog");


    }
}
