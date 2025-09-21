package com.example.NewsApplicationForProductions;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {

    @GetMapping("/heath")
    public String health(){
        return "0k";
    }
}
