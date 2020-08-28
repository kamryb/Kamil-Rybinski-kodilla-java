package com.kodilla.testing.weather.stub;

import java.util.HashMap;

public interface Temperatures {

    //first element of the map is a identifier of weather station
    //seconf element of map is temperatures in Celcius degrees

    HashMap<Integer, Double> getTemperatures();
}

