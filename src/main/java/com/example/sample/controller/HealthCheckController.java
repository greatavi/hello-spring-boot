package com.example.sample.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

    @GetMapping("/_health")
    public ResponseEntity<String> healthCheck(){
        return new ResponseEntity<String>("Working", HttpStatus.ACCEPTED);
    }
}
