package com.kodilla.testing.shape;

public class Square implements Shape{

    String name;
    String field;

    public Square(String name,String field){
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

