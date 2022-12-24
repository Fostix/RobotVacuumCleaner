package com.robotVacuumCleaner.robo.models;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    private User user;
    private int id;
    private String name;
    private String surname;
    private String password;

    @BeforeEach
    void setUp() {
        id = 0;
        name = "name";
        surname = "surname";
        password = "password";
        user = new User(id, name, surname, password);
    }

    @Test
    void testGetUserId() {
        assertEquals(id, user.getUserId());
    }

    @Test
    void testSetUserId() {
        int newId = 1;
        user.setUserId(newId);
        assertEquals(newId, user.getUserId());
    }

    @Test
    void testGetFirstName() {
        assertEquals(name, user.getFirstName());
    }

    @Test
    void setFirstName() {
        String newName = "new name";
        user.setFirstName(newName);
        assertEquals(newName, user.getFirstName());
    }

    @Test
    void getLastName() {
        assertEquals(surname, user.getLastName());
    }

    @Test
    void setLastName() {
        String newSurname = "new surname";
        user.setLastName(newSurname);
        assertEquals(newSurname, user.getLastName());
    }

    @Test
    void getPassword() {
        assertEquals(password, user.getPassword());
    }

    @Test
    void setPassword() {
        String newPassword = "new password";
        user.setPassword(newPassword);
        assertEquals(newPassword, user.getPassword());
    }
}