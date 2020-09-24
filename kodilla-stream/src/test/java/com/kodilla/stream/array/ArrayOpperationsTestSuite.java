package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;
//import java.util.List;


public class ArrayOpperationsTestSuite {
    @Test
    public void testGetAverage() {
        //Given
        int[] tab= {3,4,5,9,10,11};


        //When
       double result = ArrayOperations.getAverage(tab);
                //i tutaj jak wywolac metode: getAverage(int[] numbers) intefejsu ArrayOperations

        //Then


        Assert.assertEquals(7,result, 0.1);

        //Assertion
    }
}
