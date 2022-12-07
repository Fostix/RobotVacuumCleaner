package com.robotVacuumCleaner.robo.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoBase {
    @PostMapping(value = "gobase")
    @Operation(
            tags = "returnrobot",
            responses = {@ApiResponse(responseCode = "201", description = "The robot received a signal to go to the base",
            content = @Content(schema = @Schema(hidden = true)))},
            security = {@SecurityRequirement(name = "BearerJWT")}
    )
    @StatusCodes
    public ResponseEntity<Object> goBase(int robotId) {
        return ResponseEntity.ok().body("Robot is going to the base");
    }
}
