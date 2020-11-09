package com.kodilla.patterns.factory.tasks;



public class PaintingTask implements Task{
    private String taskName;
    private String color;
    private String whatToPoint;
    private Boolean executed=false;

    public PaintingTask(String taskName, String color, String whatToPoint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPoint = whatToPoint;
    }

    @Override
    public String executeTask() {
        executed = true;
        return whatToPoint;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public Boolean isTaskExecuted() {
       return executed;
    }
}
