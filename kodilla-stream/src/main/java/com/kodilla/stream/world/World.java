package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class World {
    private final List<Continent> theWorldList = new ArrayList<>();

    public World(){
        theWorldList.add(new Continent());
    }

    public BigDecimal getPeopleQuantity(){
        return theWorldList.stream()
                .flatMap(continent -> continent.theContinetList.getList())
                .collect(Collectors.toList())
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

    }
}
