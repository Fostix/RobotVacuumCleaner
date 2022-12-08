package com.robotVacuumCleaner.robo.controllers.room;

import com.robotVacuumCleaner.robo.controllers.StatusCodes;
import com.robotVacuumCleaner.robo.controllers.schedule.NoSchedule;
import com.robotVacuumCleaner.robo.models.Room;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UpdateRoom {
    @PutMapping(value = "room/{roomId}")
    @Operation(
            tags = "room",
            operationId = "updateRoom",
            responses = {@ApiResponse(responseCode = "200", description = "Successful",
                content = @Content(schema = @Schema(hidden = true)))}
    )
    @NoRoom
    @StatusCodes
    public ResponseEntity<Object> updateRoom(@PathVariable String roomId, @RequestBody Room room) {
        return ResponseEntity.ok().body(room);
    }
}
