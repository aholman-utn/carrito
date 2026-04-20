package com.dds.carrito.models;

public class Producto {
    String nombre;
    String codProducto;
    double precio;

    public Producto(
        String nombre, 
        String codProducto, 
        double precio
    ) {
        this.nombre = nombre;
        this.codProducto = codProducto;
        this.precio = precio;
    }

    public String getNombre() { return nombre; }

    public String getCodProducto() { return codProducto; }

    public double getPrecio() { return precio; }
}