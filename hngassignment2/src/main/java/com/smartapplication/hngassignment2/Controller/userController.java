package com.smartapplication.hngassignment2.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class userController {
    @GetMapping("/api/Greetings")
    public String greetings(@RequestParam(value = "sam", defaultValue = "Guest") String visitorName) {
        return "Hello, " + visitorName;
    }
}
