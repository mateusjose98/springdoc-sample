package com.example.springdocsample;

;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;


@Tag(name = "Test controller")
public interface TestAPI {

    @Operation(summary = "Do somethig")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Returns some value.")
    })
    ResponseEntity<SomeDto> test();


}
