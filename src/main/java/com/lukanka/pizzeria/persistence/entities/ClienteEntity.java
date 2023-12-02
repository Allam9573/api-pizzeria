package com.lukanka.pizzeria.persistence.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "clientes")
@Setter
@Getter
public class ClienteEntity {

    @Id
    @Column(name = "id_cliente")
    private String idCliente;
    private String nombre;
    private String direccion;
    private String correo;
    private String telefono;

}
