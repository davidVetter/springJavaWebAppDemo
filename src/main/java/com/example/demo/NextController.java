package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NextController {

    @GetMapping("/test")
    public String index() {
        return "<div style='width: 80vw; background-color: red; padding: 10px; margin: 0 auto;'>Hmmm did this work?</div>";
    }
    
}
