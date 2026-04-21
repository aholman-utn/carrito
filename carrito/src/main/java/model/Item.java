package model;

public class Item {
    private Carrito carrito;
    private Producto producto;
    private Integer cantidad;
    private Float precioUnitario;

    public Float getPrecio(){
        return cantidad * precioUnitario;    
    }

    public Float getPrecioOficial(){
        return producto.getPrecio(carrito.getFechaCompra());
    }

    public Float getDescuento(int porcentaje){
        return this.getPrecioOficial() * (porcentaje / 100f);
    }
}
