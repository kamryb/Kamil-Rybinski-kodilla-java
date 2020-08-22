package com.kodilla.testing.shape;

public class Triangle implements Shape{

    String name;
    String field;

    public Triangle(String name,String field){
        this.name = name;
        this.field = field;
    }
    @Override
    public String getShapeName() {
        return this.name;
    }


    @Override
    public String getField() {
        return this.field;
    }
}