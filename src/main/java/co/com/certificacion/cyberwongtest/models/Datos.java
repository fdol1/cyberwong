package co.com.certificacion.cyberwongtest.models;

public class Datos {

    private String correo, direccion, numero;

    public Datos(String correo, String direccion, String numero) {
        this.correo = correo;
        this.direccion = direccion;
        this.numero = numero;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
