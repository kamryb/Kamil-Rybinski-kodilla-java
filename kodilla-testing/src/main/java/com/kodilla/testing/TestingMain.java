package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {

        Calculator calc=new Calculator();

        int resAdd = calc.add(20,4);
        int resSub = calc.subtract(20,4);

        if(resAdd==24) {
            System.out.println("Calc-add working ok");
        }
        else {
            System.out.println("Calc-add NO-working");
        }

        if(resSub==16) {
            System.out.println("Calc-subs working ok");
        }
        else {
            System.out.println("Calc-subs NO-working ok");
        }

    }

}