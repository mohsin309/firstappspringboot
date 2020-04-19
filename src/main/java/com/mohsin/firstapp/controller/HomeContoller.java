package com.mohsin.firstapp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HomeContoller {
    @GetMapping("/")
    public String sayHelloGet(){
        return "Hello world from get updated";
    }
    @PostMapping("/")
    public String sayHelloPost(){
        return "Hello world from post";
    }
    @PutMapping("/")
    public String sayHello(){
        return "Hello world from put";
    }
    @DeleteMapping("/")
    public String sayHelloPutDelete(){
        return "Hello world from delete";
    }
}
