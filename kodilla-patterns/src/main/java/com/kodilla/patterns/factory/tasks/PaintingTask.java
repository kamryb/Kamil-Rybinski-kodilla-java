package com.kodilla.patterns.factory.tasks;



public class PaintingTask implements Task{
    String taskName;
    String color;
    String whatToPoint;

    public PaintingTask(String taskName, String color, String whatToPoint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPoint = whatToPoint;
    }

    @Override
    public String executeTask() {
        return null;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public Boolean isTaskExecuted() {
        return null;
    }
}
