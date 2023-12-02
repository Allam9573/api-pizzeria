package com.lukanka.pizzeria.web.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class Main {

    @GetMapping("/auth/login")
    public String hola(){
        return "Inicio de Sesion";
    }
}


