package model;

import java.util.Date;
import java.util.List;

public class Producto {
    private String ean13;
    private String nombre;
    private List<PrecioProducto> preciosHistoricos;

    public String getEan13() {
        return ean13;
    }
    public String getNombre() {
        return nombre;
    }
    public String getNombreCorto() {
        if (nombre == null || nombre.length() <= 5) {
            return nombre;
        }
        return nombre.substring(0, 5);
    }
    public Float getPrecio(Date fechaVigencia) {
        for (PrecioProducto p : preciosHistoricos)
            if (p.getCumpleVigencia(fechaVigencia)){
                return p.getPrecio();
            }
            return null; 
    }
}
