package com.robotVacuumCleaner.robo.models;

import java.time.format.DateTimeFormatter;

public class TaskForRobot {
    private int id;
    private int robotId;

    private String task;
    private String dateTimeFrom;

    private String instructionForRobot;

    public TaskForRobot(int id, int robotId, String task, String dateTimeFrom, String instructionForRobot) {
        this.id = id;
        this.robotId = robotId;
        this.task = task;
        this.dateTimeFrom =  dateTimeFrom;
        this.instructionForRobot = instructionForRobot;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRobotId() {
        return robotId;
    }

    public void setRobotId(int robotId) {
        this.robotId = robotId;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getInstructionForRobot() {
        return instructionForRobot;
    }

    public void setInstructionForRobot(String instructionForRobot) {
        this.instructionForRobot = instructionForRobot;
    }
}
