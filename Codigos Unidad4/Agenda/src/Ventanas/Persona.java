
package Ventanas;


public class Persona {
    //Atributos
    private String nombre;
    private String correo;
    private String celular;
    
    //Constructor
    public Persona(String nombre, String correo, String celular) {
        this.nombre = nombre;
        this.correo = correo;
        this.celular = celular;
    }
    //Metodos de Acceso

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getCelular() {
        return celular;
    }
    
}
