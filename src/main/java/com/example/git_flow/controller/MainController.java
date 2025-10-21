package com.example.git_flow.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/test")
    public String test(){
        return "test1";
    }
    @GetMapping("/test2")
    public String test2(){
        return "test2";
    }
    @GetMapping("/test3")
    public String test3(){
        return "test3";
    }
}
