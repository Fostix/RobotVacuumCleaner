package com.robotVacuumCleaner.robo.controllers.schedule;

import com.robotVacuumCleaner.robo.controllers.StatusCodes;
import com.robotVacuumCleaner.robo.models.CleaningMode;
import com.robotVacuumCleaner.robo.models.Room;
import com.robotVacuumCleaner.robo.models.TaskForRobot;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.MediaType;
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
            operationId = "getScheduleAllRobots",
            responses = {@ApiResponse(responseCode = "200", content = @Content(schema = @Schema(implementation = TaskForRobot.class),
            mediaType = MediaType.APPLICATION_JSON_VALUE))}
    )
    @StatusCodes
    @NoSchedule
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
