package com.robotVacuumCleaner.robo.controllers.user;

import com.robotVacuumCleaner.robo.controllers.StatusCodes;
import com.robotVacuumCleaner.robo.models.User;
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
public class GetUser {
    @GetMapping(value = "getUser")
    @Operation(
            tags = {"user"},
            operationId = "getUser",
            responses = {@ApiResponse(responseCode = "200", content = @Content(schema = @Schema(implementation = User.class),
                    mediaType = MediaType.APPLICATION_JSON_VALUE))}
    )
    @StatusCodes
    public ResponseEntity<Object> getSchedule() {
        return ResponseEntity.ok().body(example());
    }

    public List<User> example() {
        ArrayList<User> tasks = new ArrayList<>();

        tasks.add(new User(1, "Name", "Surname", "Secret"));

        return tasks;
    }
}
