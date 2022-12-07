package com.robotVacuumCleaner.robo.controllers.schedule;

import com.robotVacuumCleaner.robo.models.TaskForRobot;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeleteTaskInSchedule {
    @DeleteMapping(value = "/schedule/{taskId}")
    @Operation(
            tags = {"schedule"},
            operationId = "createTaskInSchedule",
            summary = "delete task in schedule",
            requestBody = @RequestBody(description = "This is the request body desc.",
                    content = @Content(schema = @Schema(implementation = TaskForRobot.class))),
            responses = {@ApiResponse(responseCode = "200", description = "Deleted task for robot",
                    content = @Content(schema = @Schema(hidden = true)))},
            security = {@SecurityRequirement(name = "BearerJWT")}
    )
    @ApiResponse(responseCode = "400", description = "Bad request",
            content = @Content(schema = @Schema(hidden = true)))
    @ApiResponse(responseCode = "401", description = "Unauthorized authorized please",
            content = @Content(schema = @Schema(hidden = true)))
    @ApiResponse(responseCode = "404", description = "don't found",
            content = @Content(schema = @Schema(hidden = true)))
    @ApiResponse(responseCode = "408", description = "Request timeout",
            content = @Content(schema = @Schema(hidden = true)))
    public ResponseEntity<Object> deleteTaskInSchedule(@PathVariable String taskId) {
        return ResponseEntity.ok().body("Task deleted");
    }
}
