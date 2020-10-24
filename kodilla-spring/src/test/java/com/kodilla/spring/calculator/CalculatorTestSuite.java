package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest

public class CalculatorTestSuite {
    @Test
    public void testCalculations(){
        //Given
        ApplicationContext context=new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double a=2;
        double b=1;
        double add = calculator.add(a,b);
        double sub = calculator.sub(a,b);
        double mul = calculator.mul(a,b);
        double div = calculator.div(a,b);
        //Then
        Assert.assertEquals(3,add,0);
        Assert.assertEquals(1,sub,0);
        Assert.assertEquals(2,mul,0);
        Assert.assertEquals(2,div,0);
    }
}
