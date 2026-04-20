package com.dds.carrito.models;

public class DireccionDeEnvio extends Direccion {
    public DireccionDeEnvio(
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