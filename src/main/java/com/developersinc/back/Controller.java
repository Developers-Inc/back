package com.developersinc.back;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class Controller {
    @GetMapping("/api/test")
    public String test() {
        return "Hello World!";
    }
}
