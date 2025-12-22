package com.example.practice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class practice {

    @GetMapping("/user")
    public String userName() {
        return "gopi";
    }
    @GetMapping("/userList")
    public List<Integer> list() {
        return new ArrayList<>(List.of(1, 2, 3, 4,8,9));
    }


}