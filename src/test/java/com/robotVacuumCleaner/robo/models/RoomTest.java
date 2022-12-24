package com.robotVacuumCleaner.robo.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {
    private Room room;
    private int id;
    private String roomOptions;

    @BeforeEach
    void setUp() {
        id = 0;
        roomOptions = "roomOptions";
        room = new Room(id, roomOptions);
    }

    @Test
    void getId() {
        assertEquals(id, room.getId());
    }

    @Test
    void setId() {
        int otherId = 1;
        room.setId(otherId);
        assertEquals(otherId, room.getId());
    }

    @Test
    void getRoomOptions() {
        assertEquals(roomOptions, room.getRoomOptions());
    }

    @Test
    void setRoomOptions() {
        String otherRoomOptions = "other room options";
        room.setRoomOptions(otherRoomOptions);
        assertEquals(otherRoomOptions, room.getRoomOptions());
    }
}