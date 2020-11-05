package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class BoardTestSuite {

    @Test
    public void testTaskAdd(){
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BoardConfig.class);

            // When & Then
    Board toDoList = context.getBean(Board.class);
     toDoList.addDoTask("Task1");
    toDoList.addDoneTask("Task2");
    toDoList.addProgressTask("Task3");

    int size1 = toDoList.getToDoList().getTasks().size();
    int size2 = toDoList.getDoneList().getTasks().size();
    int size3 = toDoList.getInProgressList().getTasks().size();

        Assert.assertEquals(1, size1);
        Assert.assertEquals(1, size2);
        Assert.assertEquals(1, size3);

    }

}