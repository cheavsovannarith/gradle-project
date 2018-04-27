package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
@RequestMapping
public class MainController {

    @GetMapping("/")
    public Map<String, Object> hbd(){
        return Collections.singletonMap("Happy Birthday To", "Sovannarith");
    }
}
