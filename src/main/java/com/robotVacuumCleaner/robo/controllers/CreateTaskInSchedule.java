package com.robotVacuumCleaner.robo.controllers;

import com.robotVacuumCleaner.robo.models.TaskForRobot;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
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
            requestBody = @RequestBody(description = "This is the request body desc.",
                    content = @Content(schema = @Schema(implementation = TaskForRobot.class))),
            responses = {@ApiResponse(responseCode = "201", description = "Created task for robot",
            content = @Content(schema = @Schema(hidden = true)))},
            security = {@SecurityRequirement(name = "BearerJWT")}
    )
    @ApiResponse(responseCode = "400", description = "Bad request",
            content = @Content(schema = @Schema(hidden = true)))
    @ApiResponse(responseCode = "401", description = "Unauthorized authorized please",
            content = @Content(schema = @Schema(hidden = true)))
    @ApiResponse(responseCode = "408", description = "Request timeout",
            content = @Content(schema = @Schema(hidden = true)))
    @ApiResponse(responseCode = "418", description = "I'm a teapot",
            content = @Content(schema = @Schema(hidden = true)))
    public ResponseEntity<Object> createTaskInSchedule(@RequestBody TaskForRobot taskForRobot) {
        return ResponseEntity.ok().body(taskForRobot);
    }
}