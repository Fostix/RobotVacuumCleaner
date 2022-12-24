package com.robotVacuumCleaner.robo.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FeedbackTest {
    private Feedback feedback;
    private int id;
    private int userId;
    private String message;

    @BeforeEach
    void setUp() {
        id = 0;
        userId = 0;
        message = "report";
        feedback = new Feedback(id, userId, message);
    }

    @Test
    void getId() {
        assertEquals(id, feedback.getId());
    }

    @Test
    void setId() {
        int otherId = 1;
        feedback.setId(otherId);
        assertEquals(otherId, feedback.getId());
    }

    @Test
    void getUserId() {
        assertEquals(userId, feedback.getUserId());
    }

    @Test
    void setUserId() {
        int otherUserId = 1;
        feedback.setUserId(otherUserId);
        assertEquals(otherUserId, feedback.getUserId());
    }

    @Test
    void getMessage() {
        assertEquals(message, feedback.getMessage());
    }

    @Test
    void setMessage() {
        String otherMessage = "other message";
        feedback.setMessage(otherMessage);
        assertEquals(otherMessage, feedback.getMessage());
    }
}