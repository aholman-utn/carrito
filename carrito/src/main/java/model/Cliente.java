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
        float deudaTotal = 0f;
        for (Carrito c: carritos) 
          if (c.estaEnProceso()){
            deudaTotal += c.getMontoDeuda();
          }

        return deudaTotal;
    }

    public boolean estaHabilitado(){
        //TODO: por ahora siempre estan habilitados
        return true;
    }
}
