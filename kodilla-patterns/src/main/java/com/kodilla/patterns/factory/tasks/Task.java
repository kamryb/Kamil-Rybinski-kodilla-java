package com.kodilla.patterns.factory.tasks;

import java.awt.*;

public interface Task {

    String executeTask();
    String getTaskName();
    Boolean isTaskExecuted();
}
