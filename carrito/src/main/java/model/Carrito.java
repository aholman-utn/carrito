package model;

import java.util.Date;
import java.util.List;

public class Carrito {
    private List<Item> items;
    private Date fechaCompra;
    private Cliente cliente;
    private Direccion direccionEnvio;
    private Direccion direccionCobro;
    private List<Pago> pagos;
    private Estado estado;


// getters y setters
public Date getFechaCompra() {
    return fechaCompra;
}

public void setEstado (Estado nuevoEstado) {
    this.estado = nuevoEstado;
}

public void cerrarCarrito() {
    setEstado( Estado.CERRADO );
}

public float getMontoPagado(float importe, Tarjeta tarjeta) {
    Pago nuevoPago = new Pago(this, tarjeta, importe);
    pagos.add(nuevoPago);
    return importe;
}

public void AgregarAListaPagos(float importe, Tarjeta tarjeta) {
    if (importe > this.getMontoCarrito()){
        System.err.println("Estas tratando de pagar más que el valor del carro");
    }
    else {
        Pago nuevoPago = new Pago(this, tarjeta, importe);
        pagos.add(nuevoPago);
    }
}

public float getMontoPagado() {
    float total = 0;
    for(Pago p : pagos)
        total += p.getMonto();
    
    return total;
}

public void FinalizarCompra() {
    if ( getMontoDeuda() <= 0 ) {
        cerrarCarrito();
    }
}

public float getMontoCarrito() {
    float montoCarrito = 0;

    for ( Item i: items ) {
        montoCarrito += i.getPrecio();
    }
    return montoCarrito;
}

public float getMontoDeuda() {
    return getMontoCarrito() - getMontoPagado();
}

}