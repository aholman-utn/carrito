package com.dds.carrito.models;

public abstract class MedioDePago {
    double saldo;
    
    public abstract boolean verificar();

    public abstract boolean pagar(double monto);

    public double getSaldo(){ return saldo; }
}