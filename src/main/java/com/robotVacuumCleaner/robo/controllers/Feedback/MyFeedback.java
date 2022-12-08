package com.robotVacuumCleaner.robo.controllers.Feedback;

import com.robotVacuumCleaner.robo.controllers.StatusCodes;
import com.robotVacuumCleaner.robo.models.Feedback;
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
public class MyFeedback {
    @GetMapping(value = "feedback/get")
    @Operation(
            tags = {"feedback"},
            operationId = "getFeedback",
            responses = {@ApiResponse(responseCode = "200", content = @Content(schema = @Schema(implementation = Feedback.class),
                    mediaType = MediaType.APPLICATION_JSON_VALUE))}
    )
    @StatusCodes
    public ResponseEntity<Object> myFeedback() {
        return ResponseEntity.ok().body(example());
    }

    public List<Feedback> example() {
        ArrayList<Feedback> feedbacks = new ArrayList<>();

        feedbacks.add(new Feedback(1,2, "nothing work AAAAA"));

        return feedbacks;
    }
}
