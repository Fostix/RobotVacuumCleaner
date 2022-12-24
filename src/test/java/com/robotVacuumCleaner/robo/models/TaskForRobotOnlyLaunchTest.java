package com.robotVacuumCleaner.robo.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TaskForRobotOnlyLaunchTest {

    private TaskForRobotOnlyLaunch taskForRobotOnlyLaunch;
    private int robotId;
    private int roomId;
    private CleaningMode cleaningMode;

    @BeforeEach
    void setUp() {
        robotId = 0;
        roomId = 0;
        cleaningMode = CleaningMode.DRY_CLEANING;
        taskForRobotOnlyLaunch = new TaskForRobotOnlyLaunch(robotId, roomId, cleaningMode);
    }

    @Test
    void getRobotId() {
        assertEquals(robotId, taskForRobotOnlyLaunch.getRobotId());
    }

    @Test
    void setRobotId() {
        int otherRobot = 1;
        taskForRobotOnlyLaunch.setRobotId(otherRobot);
        assertEquals(otherRobot, taskForRobotOnlyLaunch.getRobotId());
    }

    @Test
    void getRoomId() {
        assertEquals(roomId, taskForRobotOnlyLaunch.getRoomId());
    }

    @Test
    void setRoomId() {
        int otherRoom = 1;
        taskForRobotOnlyLaunch.setRoomId(otherRoom);
        assertEquals(otherRoom, taskForRobotOnlyLaunch.getRoomId());
    }

    @Test
    void getCleaningMode() {
        assertEquals(cleaningMode, taskForRobotOnlyLaunch.getCleaningMode());
    }

    @Test
    void setCleaningMode() {
        CleaningMode cleaningModeWet = CleaningMode.WET_CLEANING;
        taskForRobotOnlyLaunch.setCleaningMode(cleaningModeWet);
        assertEquals(cleaningModeWet, taskForRobotOnlyLaunch.getCleaningMode());
    }
}