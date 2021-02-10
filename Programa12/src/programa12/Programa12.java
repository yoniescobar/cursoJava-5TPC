
package programa12;

import java.util.Scanner;

public class Programa12 {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       String correo;
       String pass;    //declarar variables
       
       //ingreso de datos
        System.out.print("Ingrese Correo: ");
        correo = entrada.nextLine();
        System.out.print("Ingrese Password: ");
        pass = entrada.nextLine();
        
        //proceso  // metodo equals
         if( (correo.equals("yoniedilzar@gmail.com")) && (pass.equals("2021"))){
             System.out.println("Bienvenidos al Sistema....");
       }else{
             System.out.println("Tu correo o Contraseña es Incorrecto,Intenta nuevamente ");
         }
       
        
        
       
       
    }
    
}
