
package Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
  
    public static void main(String[] args) {
     
        Scanner entrada = new Scanner(System.in);
        int numerador, denominador, resultado;
    try{
          System.out.print("Ingrese el Numerador: ");
          numerador = entrada.nextInt();
          System.out.print("Ingrese el Denominador:");
          denominador = entrada.nextInt();
         
          resultado = numerador/denominador;
          System.out.print("Resultado: "+resultado);
    }catch(ArithmeticException ex1){
        System.out.println("No se puede dividir en cero!! " );
    }catch(InputMismatchException ex2){
        System.out.println("Debe digitar solamente numeros enteros!!!");
    }finally{
        System.out.println("\n Muchas Gracias, hasta Luego.....");
    }  
          
    }
    
}
