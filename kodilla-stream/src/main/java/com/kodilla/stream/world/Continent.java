package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {
    final List<Country> theContinetList = new ArrayList<>();
    public Continent(){
        theContinetList.add(new Country());
    }
    public ArrayList<Country> getList() {
       return new ArrayList<>(theContinetList);
    }
}
