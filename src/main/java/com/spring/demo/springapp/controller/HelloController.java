package com.spring.demo.springapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("hello")
    public ResponseEntity<Object> hello() {
        return new ResponseEntity<>("Hello from spring boot", HttpStatus.OK);
    }
}
