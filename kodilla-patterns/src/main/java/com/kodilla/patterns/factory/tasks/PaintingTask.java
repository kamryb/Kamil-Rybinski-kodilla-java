package com.kodilla.patterns.factory.tasks;



public class PaintingTask implements Task{
    private String taskName;
    private String color;
    private String whatToPoint;
  // private int Cunter=0;

    public PaintingTask(String taskName, String color, String whatToPoint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPoint = whatToPoint;
    }

    @Override
    public String executeTask() {
        return whatToPoint;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public Boolean isTaskExecuted() {
        if (executeTask().isEmpty()) {
            return false;
        } else { return true;
        }
    }
}
