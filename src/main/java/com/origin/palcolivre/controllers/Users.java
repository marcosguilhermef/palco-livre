package com.origin.palcolivre.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Users {
    @GetMapping("/user/{id}")
    public String get(@PathVariable String id){
        return "infor user: "+id;
    }
}
