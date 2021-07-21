
package POO;

public class Profesor extends Persona {
    private int cantPeridos;
    private float sueldo;
    private String especialidad;

    public Profesor(int cantPeridos, float sueldo, String especialidad, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.cantPeridos = cantPeridos;
        this.sueldo = sueldo;
        this.especialidad = especialidad;
    }
    
    public void mostrarDatos(){
        System.out.println("Nombre: "+getNombre());
        System.out.println("Apellidos: "+getApellido());
        System.out.println("Edad: "+getEdad());
        System.out.println("Cantidad de Periodos: "+cantPeridos);
        System.out.println("Sueldo: "+sueldo);
        System.out.println("Especialidad: "+especialidad);
    
    }
    
    
    
    
}
