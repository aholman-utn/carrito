package model;

import java.util.List;

public class Cliente {
    private String nombre;
    private String apellido;
    private String email;
    private List<Direccion> direcciones;
    private List<Carrito> carritos;
    private List<Tarjeta> tarjetas;
    private boolean esPreferncial;

    public float getMontoDeuda(){
        //FIXME: arreglar
        return 0f;
    }

    public boolean estaHabilitado(){
        //FIXME: arreglar
        return false;
    }
}
