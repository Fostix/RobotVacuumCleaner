package com.robotVacuumCleaner.robo.controllers.room;


import com.robotVacuumCleaner.robo.controllers.StatusCodes;
import com.robotVacuumCleaner.robo.models.Room;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CreateRoom {
    @PostMapping(value = "room")
    @Operation(
            tags = {"room"},
            operationId = "createRoom",
            responses = {@ApiResponse(responseCode = "201", description = "Created room",
                content = @Content(schema = @Schema(hidden = true)))}
    )
    @StatusCodes
    public ResponseEntity<Object> createRoom(@RequestBody Room room) {
        return ResponseEntity.ok().body(room);
    }
}
