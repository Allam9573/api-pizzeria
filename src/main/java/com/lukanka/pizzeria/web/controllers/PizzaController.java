package com.lukanka.pizzeria.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lukanka.pizzeria.persistence.entities.PizzaEntity;
import com.lukanka.pizzeria.service.PizzaServices;

@RestController
@RequestMapping("/api/pizzas")
public class PizzaController {

    @Autowired
    private PizzaServices pizzaServices;

    @PostMapping("/crear")
    public PizzaEntity add(@RequestBody PizzaEntity pizza) {
        return this.pizzaServices.crearPizza(pizza);
    }
}
