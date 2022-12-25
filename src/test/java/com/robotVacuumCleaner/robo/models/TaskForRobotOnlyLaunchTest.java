package com.robotVacuumCleaner.robo.models;

import com.robotVacuumCleaner.robo.models.CleaningMode.Enum.NewCleaningMode;
import com.robotVacuumCleaner.robo.models.CleaningMode.Interface.CleaningMode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TaskForRobotOnlyLaunchTest {

    private TaskForRobotOnlyLaunch taskForRobotOnlyLaunch;
    private int robotId;
    private int roomId;
    private CleaningMode robotCleaningMode;

    @BeforeEach
    void setUp() {
        robotId = 0;
        roomId = 0;
        robotCleaningMode = NewCleaningMode.DRY_CLEANING;
        taskForRobotOnlyLaunch = new TaskForRobotOnlyLaunch(robotId, roomId, robotCleaningMode);
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
        assertEquals(robotCleaningMode, taskForRobotOnlyLaunch.getCleaningMode());
    }

    @Test
    void setCleaningMode() {
        CleaningMode robotCleaningModeWet = NewCleaningMode.WET_CLEANING;
        taskForRobotOnlyLaunch.setCleaningMode(robotCleaningModeWet);
        assertEquals(robotCleaningModeWet, taskForRobotOnlyLaunch.getCleaningMode());
    }
}