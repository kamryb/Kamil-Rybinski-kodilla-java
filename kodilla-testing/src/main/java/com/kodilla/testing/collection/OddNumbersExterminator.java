package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {
    public ArrayList<Integer> exterminate (ArrayList<Integer>numbers){

        ArrayList<Integer> odden =new ArrayList<>();

        for (Integer var:numbers) {
            if(var%2==0) {

                odden.add(var) ;

            }

        }

        return odden;

    }
}
