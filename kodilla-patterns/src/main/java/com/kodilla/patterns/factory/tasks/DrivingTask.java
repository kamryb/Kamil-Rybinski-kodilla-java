package com.kodilla.patterns.factory.tasks;

import jdk.nashorn.internal.ir.IfNode;

public class DrivingTask implements Task {
    private String taskName;
    private String where;
    private String using;
    private Boolean executed=false;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public String executeTask() {
        executed = true;
        return "YES";
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
