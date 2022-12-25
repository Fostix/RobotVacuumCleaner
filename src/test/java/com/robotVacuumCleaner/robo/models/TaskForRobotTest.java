package com.robotVacuumCleaner.robo.models;

import com.robotVacuumCleaner.robo.models.CleaningMode.Enum.NewCleaningMode;
import com.robotVacuumCleaner.robo.models.CleaningMode.Interface.CleaningMode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskForRobotTest {

    private TaskForRobot taskForRobot;
    private int id;
    private int robotId;
    private int roomId;
    private String task;
    private String dateTimeFrom;
    private CleaningMode robotCleaningMode;

    @BeforeEach
    void setUp() {
        id = 0;
        robotId = 0;
        roomId = 0;
        task = "wash kitchen floors";
        dateTimeFrom = "11:00 every day";
        robotCleaningMode = NewCleaningMode.SUPER_DRY;
        taskForRobot = new TaskForRobot(id, robotId, roomId, task, dateTimeFrom, robotCleaningMode);
    }

    @Test
    void getId() {
        assertEquals(robotId, taskForRobot.getRobotId());
    }

    @Test
    void setId() {
        int newId = 0;
        taskForRobot.setId(newId);
        assertEquals(newId, taskForRobot.getId());
    }

    @Test
    void getTask() {
        assertEquals(task, taskForRobot.getTask());
    }

    @Test
    void setTask() {
        String newTask = "wash kitchen bedroom";
        taskForRobot.setTask(newTask);
        assertEquals(newTask, taskForRobot.getTask());
    }

    @Test
    void getDateTimeFrom() {
        assertEquals(dateTimeFrom, taskForRobot.getDateTimeFrom());
    }

    @Test
    void setDateTimeFrom() {
        String newDateTimeFrom = "11:30 week day";
        taskForRobot.setDateTimeFrom(newDateTimeFrom);
        assertEquals(newDateTimeFrom, taskForRobot.getDateTimeFrom());
    }
}