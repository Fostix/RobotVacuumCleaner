package com.robotVacuumCleaner.robo.models;

import com.robotVacuumCleaner.robo.models.CleaningMode.Interface.CleaningMode;

public class NewTaskForRobot<CM extends CleaningMode> extends TaskForRobot{
    public NewTaskForRobot(int id, int robotId, int roomId, String task, String dateTimeFrom, CM robotCleaningMode) {
        super(id, robotId, roomId, task, dateTimeFrom, robotCleaningMode);
    }
}
