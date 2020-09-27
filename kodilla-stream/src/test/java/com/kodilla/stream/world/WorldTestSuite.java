package com.kodilla.stream.world;



import org.junit.Before;
import org.junit.Test;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.kodilla.stream.exercise.*;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class WorldTestSuite {

    @Before
    public void before(){
        System.out.println("Test start");
    }

    @Test
    public void testGetPeopleQuantity(){
     Country poland = new Country(new BigDecimal("1000"));
     Country russia = new Country(new BigDecimal("2000"));
     Country germany = new Country (new BigDecimal("3000"));

     Country usa = new Country(new BigDecimal("4000"));
     Country mexico = new Country(new BigDecimal("5000"));

     List<Country> europeList = new ArrayList<>();
     europeList.add(poland);
     europeList.add(russia);
     europeList.add(germany);

     List<Country> nAmericaList= new ArrayList<>();
     nAmericaList.add(usa);
     nAmericaList.add(mexico);

     Continent europe = new Continent(europeList);
     Continent nAmerica = new Continent(nAmericaList);

     List<Continent> world= new ArrayList<>();
     world.add(europe);
     world.add(nAmerica);

     World wordl1 = new World(world);

        BigDecimal totalPeople =  wordl1.getPeopleQuantity();

        Assert.assertEquals(new BigDecimal("15000"),totalPeople);

        //  totalPeople = totalPeople.add(world,ge);
      //  BigDecimal totalPeople = world.getPeopleQuantity();






    }







}
