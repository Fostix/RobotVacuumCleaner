package com.robotVacuumCleaner.robo.models;

public class Feedback {
    private int id;
    private int userId;
    private String message;

    public Feedback(int id, int userId, String message) {
        this.id = id;
        this.userId = userId;
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
