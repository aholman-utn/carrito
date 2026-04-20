package com.dds.carrito.models;

public abstract class Direccion {
    String nombre;
    String direccion;
    String localidad;
    int numero;

    public String getNombre() { return nombre; }
    public String getDireccion() { return direccion; }
    public String getLocalidad() { return localidad; }
    public int getNumero() { return numero; }
}