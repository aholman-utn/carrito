package model;

import java.util.Date;

public class PrecioProducto {
    private Date fechaInicioVigencia;
    private Date fechaFinVigencia;
    private Float precio;

    public Date getFechaInicioVigencia() {
        return fechaInicioVigencia;
    }

    public Date getFechaFinVigencia() {
        return fechaFinVigencia;
    }

    public boolean getCumpleVigencia(Date fechaVigencia) {
        if (fechaVigencia.before(fechaInicioVigencia) && fechaVigencia.after(fechaFinVigencia))
            return true;
        else return false;
    }

    public Float getPrecio() {
        return precio;
    }
}
