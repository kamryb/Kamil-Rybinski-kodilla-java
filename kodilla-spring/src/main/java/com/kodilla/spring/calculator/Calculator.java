package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class Calculator {

    @Autowired
    private Display display;


    public double add(double a,double b){
     //   setDisplay();
        double c = a+b;
       display.displayValue(c);
        return c;
    }

    public double sub(double a,double b){
        //   setDisplay();
        double c = a-b;
        display.displayValue(c);
        return c;
    }

    public double mul(double a,double b){
        //   setDisplay();
        double c = a*b;
        display.displayValue(c);
        return c;
    }

    public double div(double a,double b) {
        //   setDisplay();
        //System.out.println("Error - no divide by 0") ;
        if(b==0) throw new IllegalArgumentException();
        else {
            double c = a / b;
            display.displayValue(c);
            return c;
        }
    }


}
