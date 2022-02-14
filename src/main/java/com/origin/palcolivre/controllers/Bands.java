package com.origin.palcolivre.controllers;

import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api")

public class Bands {
    @GetMapping("/band")
    public String getBand(){
        return "banda";
    }
    @GetMapping("/band/{id}")
    public String getBand(@PathVariable String id){
        return "banda: "+id;
    }
    @PostMapping("/banca")
    public String setBand(@Valid @RequestBody com.origin.palcolivre.models.Bands band){
        return "add banca";
    }

}
