package com.robotVacuumCleaner.robo.controllers.schedule;

import com.robotVacuumCleaner.robo.controllers.StatusCodes;
import com.robotVacuumCleaner.robo.models.CleaningMode;
import com.robotVacuumCleaner.robo.models.TaskForRobot;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@RestController
public class GetSchedule {

    @GetMapping(value = "schedule/All")
    @Operation(
            tags = {"schedule"},
            operationId = "getScheduleAllRobots"
    )
    @StatusCodes
    public ResponseEntity<Object> getSchedule() {
        return ResponseEntity.ok().body(example());
    }

    public List<TaskForRobot> example() {
        ArrayList<TaskForRobot> tasks = new ArrayList<>();

        tasks.add(new TaskForRobot(1, 2, 1, "hello", "04.04 Wednesday 10:12", CleaningMode.DRY_CLEANING));
        tasks.add(new TaskForRobot(2, 1, 2, "hi", "04.04 Wednesday 10:12", CleaningMode.DRY_CLEANING));
        tasks.add(new TaskForRobot(3, 2, 3, "what up", "04.04 Wednesday 10:12", CleaningMode.WET_CLEANING));

        return tasks;
    }
}
