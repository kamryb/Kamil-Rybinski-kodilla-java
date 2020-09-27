package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country {


    BigDecimal quantity;

    public Country(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPeopleQuantity(){
        return quantity;
    }
}


// Country poland = new Country(34000
// List<Country> europeList = new ArrayList<>();
// europerList.add(poland);
//
// Continent europe = new Continent(europeList);