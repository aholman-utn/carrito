package com.dds.carrito.models;
import java.util.List;
import java.util.ArrayList;

public class Cliente{
    String nombre;
    String email;
    MedioDePago tarjeta;
    Descuento descuento;
    List<Direccion> direccionesDeEnvio = new ArrayList<>();
    List<Direccion> direccionesDeCobro = new ArrayList<>();
    List<Carrito> carritos = new ArrayList<>();

    public Cliente(
        String nombre,
        String email, 
        Descuento descuento, 
        MedioDePago tarjeta
    ) {
        this.nombre = nombre;
        this.email = email;
        this.descuento = descuento;
        this.tarjeta = tarjeta;
    }

    public String getNombre() { return nombre; }

    public String getEmail() { return email; }

    public Descuento getDescuento() { return descuento; }

    public List<Direccion> getDireccionesDeCobro() { return direccionesDeCobro; }

    public List<Direccion> getDireccionesDeEnvio() { return direccionesDeEnvio; }

    public List<Carrito> getCarritos() { return carritos; }

    public MedioDePago getTarjeta() { return tarjeta; }
   
    public void agregarCarrito(Carrito carrito) {
        this.carritos.add(carrito);
    }
}