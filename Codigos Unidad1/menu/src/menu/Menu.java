
package menu;

import java.util.Scanner;


public class Menu {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        int opcion,n1,n2,operacion=0;
        
        System.out.print("Ingrese valor 1: ");
        n1 = entrada.nextInt();
        System.out.print("Ingrese valor 2: ");
        n2 = entrada.nextInt();
        
        
        do{
              System.out.println("M e n u");
              System.out.println("1. Suma");
              System.out.println("2. Resta");
              System.out.println("3. Producto");
              System.out.println("4. Division");
              System.out.println("5. Modulo");
              System.out.println("6. Salir");
              System.out.print("Ingrese una opcion: ");
              opcion = entrada.nextInt();
              
                switch(opcion){
                
                    case 1:
                            operacion = n1+n2;
                            break;
                    case 2:
                            operacion = n1-n2;
                            break;
                    case 3:
                            operacion = n1*n2;
                            break;
                    case 4:
                            operacion = n1/n2;
                            break;
                   case 5:
                            operacion = n1%n2;
                            break;
                   case 6:
                            System.out.println("Haz salido del Programa...");
                            break;
                            default:
                            System.out.println("La opcion no es valida");
                           
                
                }
                
                System.out.println("El resultado es: "+operacion);
        
        }while(opcion!=6);
        
        
    }
    
}
