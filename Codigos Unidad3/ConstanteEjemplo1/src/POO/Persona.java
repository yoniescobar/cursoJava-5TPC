
package POO;

public class Persona {
    private final String cui;  // declarado como constante
    private final String nombre; // declarado como constante
    private int edad;   //decarado como variable
    
    //constructor
    public Persona(String cui, String nombre, int edad) {
        this.cui = cui;
        this.nombre = nombre;
        this.edad = edad;
    }
    
    
   public void mostrarDatos(){
       System.out.println("El CUI es: "+cui);
       System.out.println("El nombre es: "+nombre);
       System.out.println("La edad es: "+edad);
   } 

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
   
   
    
}
