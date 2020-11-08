package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String ShopingTask = "SHOP";
    public static final String PaintingTask = "PAINT";
    public static final String DrivingTask = "DRIVE";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case ShopingTask:
                return new ShoppingTask("SPEC_BUY", "CARS", 2);

            case PaintingTask:
                return new PaintingTask("House1","WHITE", "ROOM");

            case DrivingTask:
                return new DrivingTask("KIDS","SCHOOL", "OPEL");


            default:
                return null;
        }

    }
}
