package com.robotVacuumCleaner.robo.models;

public class Room {
    private int id;
    private String roomOptions;

    public Room(int id, String roomOptions) {
        this.id = id;
        this.roomOptions = roomOptions;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoomOptions() {
        return roomOptions;
    }

    public void setRoomOptions(String roomOptions) {
        this.roomOptions = roomOptions;
    }
}
