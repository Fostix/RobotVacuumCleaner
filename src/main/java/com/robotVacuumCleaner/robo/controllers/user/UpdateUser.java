package com.robotVacuumCleaner.robo.controllers.user;

import com.robotVacuumCleaner.robo.controllers.StatusCodes;
import com.robotVacuumCleaner.robo.models.User;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UpdateUser {
    @PutMapping(value = "updateUser")
    @Operation(
            tags = "user",
            operationId = "updateUser",
            responses = {@ApiResponse(responseCode = "200", description = "Successful",
                    content = @Content(schema = @Schema(hidden = true)))}
    )
    @StatusCodes
    public ResponseEntity<Object> updateRoom(@RequestBody User user) {
        return ResponseEntity.ok().body(user);
    }
}
