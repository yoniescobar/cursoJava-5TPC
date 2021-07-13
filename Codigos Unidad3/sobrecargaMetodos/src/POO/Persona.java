
package POO;

public class Persona {
    //atributos
    String nombre;
    int edad;
    String cui;
    
    //Metodos
    //1. metodo principal contructor
    
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
       
    }
    public Persona(String cui) {
        this.cui = cui;
    }
    
    public void correr(){
        System.out.println("Soy "+nombre+" tengo "+edad+"años y esto corriendo una maraton");
    }
    
    public void correr(int km){
        System.out.println("He corrido "+km);
    }
    
    
}
