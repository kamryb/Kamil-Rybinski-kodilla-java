package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {
    final List<Country> theContinetList;

    public Continent(List<Country> theContinetList) {
        this.theContinetList = theContinetList;
    }

    public ArrayList<Country> getList() {
       return new ArrayList<>(theContinetList);
    }
}
