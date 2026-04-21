package model;

import java.util.Date;

public class PrecioProducto {
    private Date fechaInicioVigencia;
    private Date fechaFinVigencia;
    private Float precio;

    public Date getFechaInicioVigencia() {
        return new Date();
    }

    public Date getFechaFinVigencia() {
        return new Date();
    }

    public boolean getCumpleVigencia(Date fechaVigencia) {
        return false;
    }

    public Float getPrecio() {
        return 0f;
    }
}
