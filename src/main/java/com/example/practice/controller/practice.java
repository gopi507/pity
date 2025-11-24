package com.example.practice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class practice {
    @GetMapping("/user")
    public String userName(){
        return  "gopi";
    }
}
