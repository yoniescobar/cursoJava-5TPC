
package POO2;

public class principal {
    
    public static void main(String[] args) {
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        
        //Datos de persona p1
        p1.nombre = "Jose Morales";
        p1.edad = 33;
        p1.genero = "Masculino";
        p1.tipoSangre = "0+";
        
        System.out.println("-----------Datos de la Persona 1-------------");
        p1.mostrarDatos();
        p1.comer("Pizza");
        
        
        //Datos de persona p2
        p2.nombre = "Lucero Barrios";
        p2.edad = 25;
        p2.genero = "Femenino";
        p2.tipoSangre = "0-";
        
        
        System.out.println("\n-----------Datos de la Persona 2-------------");
        p2.mostrarDatos();
        p2.comer(" Ensalada ");
        
        
        
        
    }
}
