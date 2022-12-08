package com.robotVacuumCleaner.robo.controllers.user;

import com.robotVacuumCleaner.robo.controllers.StatusCodes;
import com.robotVacuumCleaner.robo.models.User;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Registration {
    @PostMapping(value = "registration")
    @Operation(
            tags = {"user"},
            operationId = "addNewUser",
            summary = "create user",
            responses = {@ApiResponse(responseCode = "201", description = "user registered",
                    content = @Content(schema = @Schema(hidden = true)))}
    )
    @StatusCodes
    public ResponseEntity<Object> createTaskInSchedule(@RequestBody User user) {
        return ResponseEntity.ok().body(user);
    }
}
