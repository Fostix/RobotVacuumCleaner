package com.robotVacuumCleaner.robo.models;

public class TaskForRobotOnlyLaunch {
    private int robotId;
    private int roomId;
    private CleaningMode cleaningMode;

    public TaskForRobotOnlyLaunch(int robotId, int roomId, CleaningMode cleaningMode) {
        this.robotId = robotId;
        this.roomId = roomId;
        this.cleaningMode = cleaningMode;
    }

    public int getRobotId() {
        return robotId;
    }

    public void setRobotId(int robotId) {
        this.robotId = robotId;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public CleaningMode getCleaningMode() {
        return cleaningMode;
    }

    public void setCleaningMode(CleaningMode cleaningMode) {
        this.cleaningMode = cleaningMode;
    }
}
