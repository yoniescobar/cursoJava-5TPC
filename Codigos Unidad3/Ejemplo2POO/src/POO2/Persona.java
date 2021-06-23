
package POO2;

public class Persona {
   //Atributos
    String nombre;
    int edad;
    String genero;
    String tipoSangre;
    
    //Metodos no retonan nigun valor
    void leer(){ 
        System.out.println("Persona esta leyendo...");
    }
    void jugar(){
        System.out.println("Persona esta jugando");
    }
    void comer(String comida ){
        System.out.println("Persona esta comiendo "+comida);
    }
    
    void mostrarDatos(){
        System.out.println("Nombre es: "+nombre);
        System.out.println("Edad es: "+edad);
        System.out.println("Genero es: "+genero);
        System.out.println("Tipo Sangre es:"+tipoSangre);
    }
    
}
