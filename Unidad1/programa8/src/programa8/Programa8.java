
package programa8;

import java.util.Scanner;

public class Programa8 {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       int edad;
       
        System.out.print("Ingrese edad: ");
        edad = entrada.nextInt(); //23
           //23>=18
        if(edad>=18){
            System.out.println("Eres Mayor de Edad");
        }else{
            System.out.println("Eres Menor de Edad");
        }
       
    }
    
}
