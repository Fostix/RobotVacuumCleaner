package com.robotVacuumCleaner.robo.controllers;

import com.robotVacuumCleaner.robo.models.TaskForRobot;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.MediaType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@ApiResponse(responseCode = "400", description = "Bad request",
        content = @Content(schema = @Schema(hidden = true)))
@ApiResponse(responseCode = "401", description = "Unauthorized authorized please",
        content = @Content(schema = @Schema(hidden = true)))
@ApiResponse(responseCode = "408", description = "Request timeout",
        content = @Content(schema = @Schema(hidden = true)))
@ApiResponse(responseCode = "418", description = "I'm a teapot",
        content = @Content(schema = @Schema(hidden = true)))
@SecurityRequirement(name = "BearerJWT")
public @interface StatusCodes {
}
