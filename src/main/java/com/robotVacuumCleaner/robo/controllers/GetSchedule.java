package com.robotVacuumCleaner.robo.controllers;

import com.robotVacuumCleaner.robo.models.TaskForRobot;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@RestController
public class GetSchedule {

    @GetMapping(value = "schedule/{IdRobots}")
    @Operation(
            tags = {"schedule"},
            operationId = "getScheduleByIdRobots"
    )
    @getMethod
    public ResponseEntity<Object> getByIdRobot(int idRobot) {
        return ResponseEntity.ok().body(example());
    }

    @GetMapping(value = "schedule/All")
    @Operation(
            tags = {"schedule"},
            operationId = "getScheduleAllRobots"
    )
    @getMethod
    public ResponseEntity<Object> getSchedule() {
        return ResponseEntity.ok().body(example());
    }

    public List<TaskForRobot> example() {
        ArrayList<TaskForRobot> tasks = new ArrayList<>();

        tasks.add(new TaskForRobot(1, 2, "hello", "04.04 Wednesday 10:12", "ACTION_FOR_ROBOT_1"));
        tasks.add(new TaskForRobot(2, 1, "hi", "04.04 Wednesday 10:12", "ACTION_FOR_ROBOT_2"));
        tasks.add(new TaskForRobot(3, 2, "what up", "04.04 Wednesday 10:12", "ACTION_FOR_ROBOT_3"));

        return tasks;
    }
}
