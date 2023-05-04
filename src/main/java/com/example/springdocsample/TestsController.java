package com.example.springdocsample;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tests")
public class TestsController implements TestAPI{

    @GetMapping
    public ResponseEntity<SomeDto> test() {
        var body = new SomeDto(1L, "Some description here....");
        return ResponseEntity.ok(body);
    }



}
