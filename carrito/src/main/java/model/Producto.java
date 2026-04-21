package model;

import java.util.Date;
import java.util.List;

public class Producto {
    private String ean13;
    private String nombre;
    private List<PrecioProducto> preciosHistoricos;

    public String getEan13() {
        return "";
    }
    public String getNombre() {
        return "";
    }
    public String getNombreCorto() {
        return "";
    }
    public Float getPrecio(Date fechaVigencia) {
        return 0f;
    }
}
