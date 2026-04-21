package model;

public class Direccion {
    private String calle1;
    private String calle2;
    private String altura;
    private boolean sinAltura;
    private String piso;
    private String cuerpo;
    private String departamento;
    private Ciudad ciudad;

    public String getDireccion(){
        //FIXME: arreglar
        String direccion = calle1 + calle2 + altura + piso+
                cuerpo+ departamento + ciudad;
        return direccion;
    }
    public String getLatitud(){
        //FIXME: arreglar
        String latitud = "";
        return latitud;
    }

    public String getLongitud(){
        //FIXME: arreglar
        String longitud = "";
        return longitud;
    }
    public boolean estaHabilitadaEnvio(){
        //FIXME: arreglar
        return false;
    }
}
