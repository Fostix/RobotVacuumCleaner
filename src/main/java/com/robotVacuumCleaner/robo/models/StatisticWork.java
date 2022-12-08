package com.robotVacuumCleaner.robo.models;

public class StatisticWork {
    private String staticInformation;

    public StatisticWork(String code) {
        this.staticInformation = code;
    }

    public String getStaticInformation() {
        return staticInformation;
    }

    public void setStaticInformation(String staticInformation) {
        this.staticInformation = staticInformation;
    }
}
