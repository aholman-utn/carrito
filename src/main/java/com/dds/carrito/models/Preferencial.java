package com.dds.carrito.models;

public class Preferencial extends Descuento {
    @Override
    public double aplicar(double monto) {
        return monto * 0.75;
    }
}