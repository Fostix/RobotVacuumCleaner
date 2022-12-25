package com.robotVacuumCleaner.robo.models;

import com.robotVacuumCleaner.robo.models.CleaningMode.Interface.CleaningMode;

public class TaskForRobot<CM extends CleaningMode> extends TaskForRobotOnlyLaunch{
    private int id;

    private String task;
    private String dateTimeFrom;

    public TaskForRobot(int id, int robotId, int roomId, String task, String dateTimeFrom, CM robotCleaningMode) {
        super(robotId, roomId, robotCleaningMode);
        this.id = id;
        this.task = task;
        this.dateTimeFrom = dateTimeFrom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getDateTimeFrom() {
        return dateTimeFrom;
    }

    public void setDateTimeFrom(String dateTimeFrom) {
        this.dateTimeFrom = dateTimeFrom;
    }
}
