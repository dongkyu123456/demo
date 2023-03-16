package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping({"/",""})
public class MainController {
   @GetMapping("/terran")
    private String terran(){
        return "terran";
    }

    @GetMapping("/protoss")
    public String protoss() {
        return "protoss";
    } 

    @GetMapping("/zerg")
    public String zerg() {
        return "zerg";
    } 
    
}
