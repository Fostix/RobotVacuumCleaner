package com.robotVacuumCleaner.robo.models;

public class Task {
    private String id;
    private String task;
    private byte taskStatus;

    public Task(String id, String task, byte taskStatus) {
        this.id = id;
        this.task = task;
        this.taskStatus = taskStatus;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }
}
