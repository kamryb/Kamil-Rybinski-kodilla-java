package com.kodilla.stream.exercise;

import java.util.ArrayList;
import java.util.List;

public class FilterEven {
    public List<Integer> filter(List<Integer> numbers){
        List<Integer> list = new ArrayList<>();
        for(int n=0; n< numbers.size();n++) {
            if(numbers.get(n)%2==0) {
                list.add(numbers.get(n));
                }
        }
        return list;
    }

}

