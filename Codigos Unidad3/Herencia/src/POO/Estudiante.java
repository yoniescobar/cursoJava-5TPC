
package POO;


public class Estudiante extends Persona  { 
    
    private int codigoPersonal;
    private float notafinal;

    public Estudiante(int codigoPersonal, float notafinal, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.codigoPersonal = codigoPersonal;
        this.notafinal = notafinal;
    }
    
    public void mostrarDatos(){
        System.out.println("Nombre: "+getNombre()+
                   "\n Apellidos: "+getApellido()+
                   "\n Edad: "+getEdad()+
                   "\n Codigo Personal:"+codigoPersonal+
                   "\n Nota Final: "+notafinal
                );
        
    
    }
    
    
}
