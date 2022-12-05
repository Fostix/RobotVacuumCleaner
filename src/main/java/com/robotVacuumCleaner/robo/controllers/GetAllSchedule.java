package com.robotVacuumCleaner.robo.controllers;


import com.robotVacuumCleaner.robo.models.Task;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class GetAllSchedule {

    @GetMapping(value = "Schedule")
    @Operation(
            tags = {"tasks"}
    )
    public ResponseEntity<Object> getAllSchedule(Boolean isCompleted) {
        ArrayList<Task> tasks = new ArrayList<>();
        tasks.add(new Task("1", "hello"));
        tasks.add(new Task("2", "hi"));
        tasks.add(new Task("3", "what up"));

        return ResponseEntity.ok().body(tasks);
    }
}
