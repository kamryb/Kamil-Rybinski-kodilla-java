package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testShoppingTask(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shoppingTask = factory.makeTask(TaskFactory.ShopingTask);
        Task drivingTask = factory.makeTask(TaskFactory.DrivingTask);
        Task paintingTask = factory.makeTask(TaskFactory.PaintingTask);

        //Then
        Assert.assertEquals(true,shoppingTask.isTaskExecuted());
        Assert.assertEquals(true,drivingTask.isTaskExecuted());
        Assert.assertEquals(true,paintingTask.isTaskExecuted());
    }



}
