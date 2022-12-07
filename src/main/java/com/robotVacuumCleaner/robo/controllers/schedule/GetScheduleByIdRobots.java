package com.robotVacuumCleaner.robo.controllers.schedule;

import com.robotVacuumCleaner.robo.controllers.StatusCodes;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetScheduleByIdRobots {
    @GetMapping(value = "schedule/{IdRobots}")
    @Operation(
            tags = {"schedule"},
            operationId = "getScheduleByIdRobots"
    )
    @StatusCodes
    public ResponseEntity<Object> getByIdRobot(int idRobot) {
        return ResponseEntity.ok().body(new GetSchedule().example());
    }
}
