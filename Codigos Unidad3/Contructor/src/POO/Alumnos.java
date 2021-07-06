
package POO;

public class Alumnos {
    //Atributos
    int clave;
    String nombre;
    String apellidos;

   //Creando método Contructor.
    
       public  Alumnos(int clave, String nombre, String apellidos ){
             //Inicializando los atributos
             //clave = nC
             this.clave = clave;
             this.nombre = nombre;
             this.apellidos=apellidos;
         }
    
    
    //Metodos
    void verDatos(){
        System.out.println("No. Clave:  "+clave);
        System.out.println("Nombre : "+nombre);
        System.out.println("Apellido: "+apellidos);
    }
    
    
    
}
