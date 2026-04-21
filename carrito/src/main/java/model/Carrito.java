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
    private List<Estado> estados;
}
