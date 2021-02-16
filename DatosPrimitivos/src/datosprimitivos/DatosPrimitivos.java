
package datosprimitivos;

import java.util.Scanner;


public class DatosPrimitivos {
    
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);  //1. Clase escanerr  (entrada)
      
      String nombre; //2. Declaracion de varibles
      byte edad;
      
      
      //3. ingreso de informacion
        System.out.print("Ingrese Nombre del Estudiante: ");
        nombre = entrada.nextLine();
        System.out.print("Ingrese su edad: ");
        edad = entrada.nextByte();
        
        //4. salida de Informacion
        System.out.println("Datos Personales");
        System.out.print("Nombre: "+nombre+" Edad: "+edad+"\n");
        
        
      
        
        
        
        
    }
    
}
