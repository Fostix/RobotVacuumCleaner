package com.robotVacuumCleaner.robo.controllers.schedule;

import com.robotVacuumCleaner.robo.controllers.StatusCodes;
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
            requestBody = @RequestBody(content = @Content(schema = @Schema(implementation = TaskForRobot.class))),
            responses = {@ApiResponse(responseCode = "200", description = "Deleted task for robot",
                    content = @Content(schema = @Schema(hidden = true)))}
    )
    @StatusCodes
    @NoSchedule
    public ResponseEntity<Object> deleteTaskInSchedule(@PathVariable String taskId) {
        return ResponseEntity.ok().body("Task deleted");
    }
}
