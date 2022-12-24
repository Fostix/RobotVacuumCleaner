package com.robotVacuumCleaner.robo.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticWorkTest {
    private StatisticWork statisticWork;
    private String jsonCode;

    @BeforeEach
    void setUp() {
        jsonCode = "[{ \"statistic: \"statistic information\"\"}]";
        statisticWork = new StatisticWork(jsonCode);
    }

    @Test
    void getStaticInformation() {
        assertEquals(jsonCode, statisticWork.getStaticInformation());
    }

    @Test
    void setStaticInformation() {
        String otherJsonCode = "[{ \"statistic: \"other statistic information\"\"}]";
        statisticWork.setStaticInformation(otherJsonCode);
        assertEquals(otherJsonCode, statisticWork.getStaticInformation());
    }
}