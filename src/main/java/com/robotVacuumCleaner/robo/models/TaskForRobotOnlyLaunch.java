package com.robotVacuumCleaner.robo.models;

import com.robotVacuumCleaner.robo.models.CleaningMode.Interface.CleaningMode;

public class TaskForRobotOnlyLaunch<CM extends CleaningMode> {
    private int robotId;
    private int roomId;
    private CleaningMode robotCleaningMode;

    public TaskForRobotOnlyLaunch(int robotId, int roomId, CM robotCleaningMode) {
        this.robotId = robotId;
        this.roomId = roomId;
        this.robotCleaningMode = robotCleaningMode;
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
        return robotCleaningMode;
    }

    public void setCleaningMode(CleaningMode robotCleaningMode) {
        this.robotCleaningMode = robotCleaningMode;
    }
}
