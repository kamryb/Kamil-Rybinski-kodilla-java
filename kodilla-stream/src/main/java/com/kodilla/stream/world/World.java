package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class World {
    private final List<Continent> theWorldList;

    public World(List<Continent> theWorldList) {
        this.theWorldList = theWorldList;
    }

    public BigDecimal getPeopleQuantity(){
        return (BigDecimal) theWorldList.stream()
               .flatMap(continent -> continent.getList().stream())
               .map(country -> country.getPeopleQuantity())
                //.reduce(BigDecimal.ZERO,BigDecimal::add);
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
           //     .collect(Collectors.summarizingDouble(Continent::getList())


    }
}
