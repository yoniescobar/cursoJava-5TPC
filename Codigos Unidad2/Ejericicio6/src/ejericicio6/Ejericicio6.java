
package ejericicio6;

import java.util.Scanner;

public class Ejericicio6 {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
      //1. Declarar el los vector
      int[] numeros = new int[10]; //arreglo  para 10 elementos
      
      //2. llenar el arreglo
      for(int i=0;i<numeros.length;i++){
          System.out.print((i+1)+" Ingrese numero: ");
          numeros[i] = entrada.nextInt();
      }
      
      //3. Mostrar el resultado ultimo,primer,sugundo,penul...
        System.out.println("El resultado es: ");
        for(int i=0;i<5;i++){
            System.out.print(numeros[i]+" "); //primer,segundo,tercer 
            System.out.print(numeros[9-i]+" "); //ultimo,penul,ante pen
        }
      
    }
    
}
