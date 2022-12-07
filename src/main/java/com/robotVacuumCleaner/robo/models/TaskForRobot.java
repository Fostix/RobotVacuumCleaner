package com.robotVacuumCleaner.robo.models;

public class TaskForRobot extends TaskForRobotOnlyLaunch{
    private int id;

    private String task;
    private String dateTimeFrom;

    public TaskForRobot(int id, int robotId, int roomId, String task, String dateTimeFrom, CleaningMode cleaningMode) {
        super(robotId, roomId, cleaningMode);
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
