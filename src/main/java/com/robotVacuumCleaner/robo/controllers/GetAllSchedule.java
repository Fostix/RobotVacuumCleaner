package com.robotVacuumCleaner.robo.controllers;


import com.robotVacuumCleaner.robo.models.Task;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class GetAllSchedule {
    @GetMapping(value = "tasksByStatus")
    @Operation(
            tags = {"tasks"},
            operationId = "getScheduleByStatus",
            summary = "information status in description",
            description = "0 - don't make, 1 - done, 2 - in progress",
            requestBody = @RequestBody(description = "This is the request body desc."),
            responses = {
                    @ApiResponse(responseCode = "200",
                            description = "Ok", content = @Content(
                                    schema = @Schema(implementation = Task.class),
                            mediaType = MediaType.APPLICATION_JSON_VALUE)),
                    @ApiResponse(responseCode = "204", description = "no schedule"),
                    @ApiResponse(responseCode = "400", description = "Bad request"),
                    @ApiResponse(responseCode = "404", description = "don't found"),
                    @ApiResponse(responseCode = "408", description = "Request timeout"),
                    @ApiResponse(responseCode = "418", description = "I'm a teapot")
            }
    )
    public ResponseEntity<Object> getAllSchedule(byte taskStatus) {
        return ResponseEntity.ok().body(example());
    }


    @GetMapping(value = "allTasks")
    @Operation(
            tags = {"tasks",},
            operationId = "getSchedule",
            requestBody = @RequestBody(description = "This is the request body desc."),
            responses = {
                    @ApiResponse(responseCode = "200",
                            content = @Content(schema = @Schema(implementation = Task.class),
                                    mediaType = MediaType.APPLICATION_JSON_VALUE)),
                    @ApiResponse(responseCode = "204", description = "no schedule"),
                    @ApiResponse(responseCode = "400", description = "Bad request"),
                    @ApiResponse(responseCode = "404", description = "don't found"),
                    @ApiResponse(responseCode = "408", description = "Request timeout"),
                    @ApiResponse(responseCode = "418", description = "I'm a teapot")
            }
    )
    public ResponseEntity<Object> getAllSchedule() {
        return ResponseEntity.ok().body(example());
    }

    public ArrayList<Task> example() {
        ArrayList<Task> tasks = new ArrayList<>();

        tasks.add(new Task("1", "hello", (byte) 1));
        tasks.add(new Task("2", "hi", (byte) 0));
        tasks.add(new Task("3", "what up", (byte) 2));

        return tasks;
    }
}
