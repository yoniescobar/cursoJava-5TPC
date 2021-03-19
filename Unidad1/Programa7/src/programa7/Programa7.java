
package programa7;

import java.util.Scanner;


public class Programa7 {

    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      int nota;
      
        System.out.print("Ingrese Nota: ");
        nota = entrada.nextInt();
        
        if (nota>=60) {
            System.out.println("Aprobado");
        } else {
            System.out.println("No Aprobado");
        }
      
    }
    
}
