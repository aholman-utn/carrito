package model;

public class Pago {
    private Carrito carrito;
    private Tarjeta tarjeta;
    private float monto;

    public boolean verificarTarjeta() {
        //FIXME: arreglar
        return true;
    }

    public float getMonto() {
        return monto;
    }

    public Pago(Carrito carrito, Tarjeta tarjeta, float monto) {
        this.carrito = carrito;
        this.tarjeta = tarjeta;
        this.monto = monto;
    }
}
