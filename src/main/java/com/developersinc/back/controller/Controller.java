package com.developersinc.back.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @CrossOrigin("*")
    @GetMapping("/api/test")
    public String test() {
        return "Hello world from back-end!";
    }
}
