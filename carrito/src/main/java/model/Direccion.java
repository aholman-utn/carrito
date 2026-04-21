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
        String direccion;
        if (esUnaEsquina()) {
             direccion = calle1 + calle2 + piso + cuerpo + departamento + ciudad; // Convengamos que si estoy en una esquina igual tengo una direccion con numero, y que si solo pongo el cruce de calles tengo 4 posibles esquinas
        }
        else direccion = calle1 + altura + piso + cuerpo + departamento + ciudad;
       
        return direccion;
    }

    public boolean esUnaEsquina(){
        return(calle1 != null && calle2 != null);
    }

    public String getLatitud(){
        //TODO: todavia no se usar la api de google para que me de la latitud, besis
        String latitud = "";
        return latitud;
    }

    public String getLongitud(){
        //TODO: todavia no se usar la api de google para que me de la longitud, besis
        String longitud = "";
        return longitud;
    }
    public boolean estaHabilitadaEnvio(){
        //No le tenemos asco a ningun lugar, respiramos barrio
        return true;
    }
}
