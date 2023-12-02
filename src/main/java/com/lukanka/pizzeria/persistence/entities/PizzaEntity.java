package com.lukanka.pizzeria.persistence.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "pizza")
@Setter
@Getter
@NoArgsConstructor
public class PizzaEntity {

    @Id
    @Column(name = "id_pizza", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPizza;
    private String nombre;
    private String descripcion;
    @Column(columnDefinition = "Decimal(5,2)")
    private Double precio;
    @Column(columnDefinition = "TINYINT")
    private Boolean vegetariana;
    @Column(columnDefinition = "TINYINT")
    private Boolean vegana;
    @Column(columnDefinition = "TINYINT")
    private Boolean disponible;

}
