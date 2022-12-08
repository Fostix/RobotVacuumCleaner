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

@RestController
public class GetRoomById {
    @GetMapping(value = "room{roomId}")
    @Operation(
            tags = {"room"},
            operationId = "getRoomById",
            responses = {@ApiResponse(responseCode = "200", content = @Content(schema = @Schema(implementation = Room.class),
                mediaType = MediaType.APPLICATION_JSON_VALUE))}
    )
    @NoRoom
    @StatusCodes
    public ResponseEntity<Object> getRoomById(int roomId) {
        return ResponseEntity.ok().body(new GetAllRooms().example());
    }
}
