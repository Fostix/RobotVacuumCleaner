package com.robotVacuumCleaner.robo.controllers.schedule;

import com.robotVacuumCleaner.robo.controllers.StatusCodes;
import com.robotVacuumCleaner.robo.models.TaskForRobot;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetScheduleByIdRobots {
    @GetMapping(value = "schedule/{IdRobots}")
    @Operation(
            tags = {"schedule"},
            operationId = "getScheduleByIdRobots",
            responses = {@ApiResponse(responseCode = "200", content = @Content(schema = @Schema(implementation = TaskForRobot.class),
                    mediaType = MediaType.APPLICATION_JSON_VALUE))}
    )
    @StatusCodes
    @NoSchedule
    public ResponseEntity<Object> getByIdRobot(int idRobot) {
        return ResponseEntity.ok().body(new GetSchedule().example());
    }
}
