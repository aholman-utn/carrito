package com.dds.carrito.models;

public class Tarjeta extends MedioDePago {
    @Override
    public boolean verificar() {
        return true;
    }

    @Override
    public boolean pagar(double monto) {
        //Luego podriamos querer manejar Deudas.
        if (!this.verificar()){
            return false;
        }

        if (saldo >= monto){
            saldo -= monto;
            return true;
        }

        return false;
    }
}