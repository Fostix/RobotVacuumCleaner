package com.robotVacuumCleaner.robo.controllers.room;

import com.robotVacuumCleaner.robo.models.Room;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetRoomById {
    @GetMapping(value = "room{roomId}")
    @Operation(
            tags = {"room"},
            operationId = "getRoomById",
            responses = {@ApiResponse(responseCode = "200", content = @Content(schema = @Schema(implementation = Room.class),
                mediaType = MediaType.APPLICATION_JSON_VALUE))},
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
    public ResponseEntity<Object> getRoomById(int roomId) {
        return ResponseEntity.ok().body(new GetAllRooms().example());
    }
}
