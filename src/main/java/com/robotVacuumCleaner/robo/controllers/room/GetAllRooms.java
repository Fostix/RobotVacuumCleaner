package com.robotVacuumCleaner.robo.controllers.room;

import com.robotVacuumCleaner.robo.controllers.StatusCodes;
import com.robotVacuumCleaner.robo.controllers.schedule.NoSchedule;
import com.robotVacuumCleaner.robo.models.Room;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
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
                    mediaType = MediaType.APPLICATION_JSON_VALUE))}
    )
    @NoRoom
    @StatusCodes
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
