package com.example.Tutorialapirest.controller.Status;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    @GetMapping(path = "/api/status")
    public String check(){
        return "online";
    }
}
