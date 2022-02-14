package com.origin.palcolivre.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Styles {
    @GetMapping("/styles")
    public String getAllStyles(){
        return "todos os estilos";
    }
}
