package com.kodilla.hibernate.tasklist.dao;
import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.tasklist.TaskList;
import com.sun.xml.bind.v2.model.core.ID;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;
    private static final String DESCRIPTION = "Test2: Learn Hibernate";
    private static final String LISTNAME = "ListNo1";



    @Test
    public void testFindByListName() {
        //Given
        TaskList taskList = new TaskList(LISTNAME, DESCRIPTION);

        //When
        taskListDao.save(taskList);
        String listName = taskList.getListName();

        //When
        List<TaskList> readTaskss = taskListDao.findByListName(listName);

        //Then
        Assert.assertEquals(1, readTaskss.size());

        //CleanUp
      int id = readTaskss.get(0).getId();
      taskListDao.deleteById(id);
    }
    
    

    
}
