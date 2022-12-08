package com.robotVacuumCleaner.robo.controllers;

import com.robotVacuumCleaner.robo.models.StatisticWork;
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
public class GetStatisticWork {
    @GetMapping(value = "statistic")
    @Operation(
            tags = {"statistic"},
            operationId = "getStatistic",
            responses = {@ApiResponse(responseCode = "200", content = @Content(schema = @Schema(implementation = StatisticWork.class),
                    mediaType = MediaType.APPLICATION_JSON_VALUE))}
    )
    @StatusCodes
    public ResponseEntity<Object> myFeedback() {
        return ResponseEntity.ok().body(example());
    }

    public List<StatisticWork> example() {
        ArrayList<StatisticWork> statisticWork = new ArrayList<>();

        statisticWork.add(new StatisticWork("statistic written"));

        return statisticWork;
    }
}
