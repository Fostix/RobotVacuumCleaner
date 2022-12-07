package com.robotVacuumCleaner.robo.controllers.schedule;

import com.robotVacuumCleaner.robo.models.TaskForRobot;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.web.bind.annotation.RequestBody;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UpdateTaskInSchedule {

    @PutMapping(value = "schedule/{scheduleId}")
    @Operation(
            tags = "schedule",
            operationId = "updateTaskInSchedule",
            responses = {@ApiResponse(responseCode = "200", description = "Successful",
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
    public ResponseEntity<Object> updateTaskInSchedule(@PathVariable String scheduleId, @RequestBody TaskForRobot taskForRobot) {
        return ResponseEntity.ok().body(taskForRobot);
    }
}
