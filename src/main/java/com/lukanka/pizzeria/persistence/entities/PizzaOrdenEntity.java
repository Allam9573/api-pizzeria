package com.lukanka.pizzeria.persistence.entities;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "orden_pizza")
@Setter
@Getter
public class PizzaOrdenEntity {
    @Id
    @Column(name = "id_orden")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idOrden;
    @Column(name = "id_cliente")
    private String idCliente;
    @Column(columnDefinition = "DATETIME")
    private LocalDateTime fecha;
    @Column(columnDefinition = "DECIMAL(6,2)")
    private Double total;
    @Column(name = "nota_adicional")
    private String notaAdicional;

    @OneToOne
    @JoinColumn(name = "id_cliente", referencedColumnName = "id_cliente", insertable = false, updatable = false)
    private ClienteEntity cliente;

    @OneToMany(mappedBy = "orden")
    private List<OrdenItemEntity> items;
}
