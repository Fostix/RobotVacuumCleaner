package com.robotVacuumCleaner.robo.controllers.room;

import com.robotVacuumCleaner.robo.controllers.StatusCodes;
import com.robotVacuumCleaner.robo.controllers.schedule.NoSchedule;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeleteRoomById {
    @DeleteMapping(value = "room/{roomId}")
    @Operation(
            tags = "room",
            operationId = "deleteRoomById",
            responses = {@ApiResponse(responseCode = "200", description = "Deleted room",
                    content = @Content(schema = @Schema(hidden = true)))}
    )
    @NoRoom
    @StatusCodes
    public ResponseEntity<Object> deleteRoomById(@PathVariable String roomId) {
        return ResponseEntity.ok().body("Task deleted");
    }
}
