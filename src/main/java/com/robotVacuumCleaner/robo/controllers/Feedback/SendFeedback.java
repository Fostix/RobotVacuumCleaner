package com.robotVacuumCleaner.robo.controllers.Feedback;

import com.robotVacuumCleaner.robo.controllers.StatusCodes;
import com.robotVacuumCleaner.robo.models.Feedback;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SendFeedback {
    @PostMapping(value = "feedback")
    @Operation(
            tags = {"feedback"},
            operationId = "sendFeedback",
            responses = {@ApiResponse(responseCode = "201", description = "Created feedback",
                    content = @Content(schema = @Schema(hidden = true)))}
    )
    @StatusCodes
    public ResponseEntity<Object> sendFeedback(@RequestBody Feedback feedback) {
        return ResponseEntity.ok().body(feedback);
    }
}
