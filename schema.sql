create database pizzeria;
use pizzeria;

create table pizza(
    id_pizza int auto_increment,
    nombre varchar(30),
    descripcion varchar(100),
    precio decimal(5,2),
    vegetariana tinyint,
    vegana tinyint,
    disponible tinyint,
    primary key(id_pizza)
);

create table clientes(
    id_cliente varchar(15) primary key,
    nombre varchar(50),
    direccion varchar(50),
    correo varchar(50),
    telefono varchar(15)
);

create table orden_pizza(
    id_orden int primary key auto_increment,
    id_cliente varchar(15),
    fecha datetime,
    total decimal(5,2),
    nota_adicional varchar(50),
    foreign key (id_cliente) references clientes(id_cliente)
);

create table orden_item(
    id_item int primary key auto_increment,
    id_orden int,
    id_pizza int,
    cantidad decimal(2,1),
    precio decimal(5,2),
    foreign key (id_orden) references orden_pizza(id_orden),
    foreign key (id_pizza) references pizza(id_pizza)
);