package com.lukanka.pizzeria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lukanka.pizzeria.persistence.entities.PizzaEntity;
import com.lukanka.pizzeria.persistence.repositories.PizzaRepository;

@Service
public class PizzaServices {

    @Autowired
    private PizzaRepository pizzaRepository;

    public PizzaEntity crearPizza(PizzaEntity pizza) {
        return this.pizzaRepository.save(pizza);
    }

}
