package com.robotVacuumCleaner.robo.controllers.room;

import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@ApiResponse(responseCode = "204", description = "no schedule",
        content = @Content(schema = @Schema(hidden = true)))
public @interface NoSchedule {
}
