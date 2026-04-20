package com.dds.carrito.models;
import java.util.List;
import java.util.ArrayList;

public class Carrito {
    List<Producto> listaDeProductos = new ArrayList<>();

    public void agregar(Producto p)
    {
        listaDeProductos.add(p);
    }

    public void sacar(Producto p) 
    {
        listaDeProductos.remove(p);
    }

    public double calcularPrecioFinal(Descuento d)
    {
        double total = listaDeProductos.stream()
                .mapToDouble(p -> p.getPrecio())
                .sum();

        return d.aplicar(total);
    }
}