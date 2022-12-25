package com.robotVacuumCleaner.robo.models.CleaningMode.Enum;

import com.robotVacuumCleaner.robo.models.CleaningMode.Interface.CleaningMode;

public enum NewCleaningMode implements CleaningMode {
    SUPER_DRY,
    SUPER_WET,
    DRY_CLEANING,
    WET_CLEANING;
}
