package POO;

import javax.swing.JOptionPane;

public class Persona {
    //atributos
    String nombres;
    String apellidos;
    String dpi;
    boolean tipo;
    
    //constructor

    public Persona(String nombres, String apellidos, String dpi, boolean tipo) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dpi = dpi;
        this.tipo = tipo;
    }
    
    
    public void verDatos(){
        JOptionPane.showMessageDialog(null,"Mostrando Datos");
    }
    
    
    
    
}
