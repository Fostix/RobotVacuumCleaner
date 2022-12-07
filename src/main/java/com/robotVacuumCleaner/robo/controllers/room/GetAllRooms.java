package com.robotVacuumCleaner.robo.controllers.room;

import com.robotVacuumCleaner.robo.models.Room;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class GetAllRooms {

    @GetMapping(value = "room/All")
    @Operation(
            tags = {"room"},
            operationId = "getRoom",
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
    public ResponseEntity<Object> getAllRooms() {
        return ResponseEntity.ok().body(example());
    }

    public List<Room> example() {
        ArrayList<Room> room = new ArrayList<>();

        room.add(new Room(1,"ROOM_CODE1"));
        room.add(new Room(2,"ROOM_CODE2"));
        room.add(new Room(3,"ROOM_CODE3"));

        return room;
    }
}
