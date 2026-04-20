package com.dds.carrito.models;

public class DireccionDeCobro extends Direccion {
    public DireccionDeCobro(
        String nombre,
        String direccion, 
        String localidad, 
        int numero

    ) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.localidad = localidad;
        this.numero = numero;
    }
}