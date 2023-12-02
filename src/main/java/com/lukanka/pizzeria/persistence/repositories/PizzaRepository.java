package com.lukanka.pizzeria.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lukanka.pizzeria.persistence.entities.PizzaEntity;

public interface PizzaRepository extends JpaRepository<PizzaEntity, Integer> {
    
}
