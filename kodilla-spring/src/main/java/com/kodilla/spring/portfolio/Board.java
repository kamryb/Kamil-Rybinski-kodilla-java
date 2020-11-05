package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
public class Board {

    private TaskList toDoList;
    private TaskList inProgressList;
    private TaskList doneList;

    public Board(@Qualifier("list1") TaskList toDoList, TaskList inProgressList,TaskList doneList){
        this.toDoList = toDoList;
        this.inProgressList =inProgressList;
        this.doneList =doneList;
    }

    public void addDoTask(String task) {
         this.toDoList.getTasks().add(task);
    }

    public void addProgressTask(String task) {
        this.inProgressList.getTasks().add(task);
    }

    public void addDoneTask(String task) {
        this.doneList.getTasks().add(task);
    }

    public TaskList getToDoList() {
        return toDoList;
    }

    public TaskList getInProgressList() {
        return inProgressList;
    }

    public TaskList getDoneList() {
        return doneList;
    }
}
