package com.lukanka.pizzeria.persistence.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "orden_item")
@IdClass(OrderItemId.class)
@Setter
@Getter
@NoArgsConstructor
public class OrdenItemEntity {

    @Id
    @Column(name = "id_item")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idItem;

    @Id
    @Column(name = "id_orden")
    private Integer idOrden;

    @Column(name = "id_pizza")
    private Integer idPizza;
    @Column(columnDefinition = "DECIMAL(2,1)")
    private Double cantidad;
    @Column(columnDefinition = "DECIMAL(5,1)")
    private Double precio;

    @ManyToOne
    @JoinColumn(name = "id_orden", referencedColumnName = "id_orden", insertable = false, updatable = false)
    private PizzaOrdenEntity orden;

    @OneToOne
    @JoinColumn(name = "id_pizza", referencedColumnName = "id_pizza", insertable = false, updatable = false)
    private PizzaEntity pizza;

}
