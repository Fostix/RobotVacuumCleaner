package com.robotVacuumCleaner.robo.controllers.schedule;

import com.robotVacuumCleaner.robo.controllers.StatusCodes;
import com.robotVacuumCleaner.robo.models.TaskForRobot;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CreateTaskInSchedule {
    @PostMapping(value = "schedule/create")
    @Operation(
            tags = {"schedule"},
            operationId = "createTaskInSchedule",
            summary = "create schedule for robot",
            responses = {@ApiResponse(responseCode = "201", description = "Created task for robot",
                content = @Content(schema = @Schema(hidden = true)))}
    )
    @StatusCodes
    public ResponseEntity<Object> createTaskInSchedule(@RequestBody TaskForRobot taskForRobot) {
        return ResponseEntity.ok().body(taskForRobot);
    }
}
