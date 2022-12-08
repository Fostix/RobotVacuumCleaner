package com.robotVacuumCleaner.robo.controllers;

import com.robotVacuumCleaner.robo.models.TaskForRobot;
import com.robotVacuumCleaner.robo.models.TaskForRobotOnlyLaunch;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SendClean {
    @PostMapping("sendclean/launch")
    @Operation(
            tags = "sendCleanTheRoom",
            responses = {@ApiResponse(responseCode = "201", description = "robot is going to base",
                    content = @Content(schema = @Schema(hidden = true)))},
            security = {@SecurityRequirement(name = "BearerJWT")}
    )
    @StatusCodes
    public ResponseEntity<Object> sendClean(@RequestBody TaskForRobotOnlyLaunch taskForRobot) {
        return ResponseEntity.ok().body(taskForRobot);
    }
}
