
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      //1. Declarar el los vectores a utilizar
      int[] a = new int[10]; //arreglo de a para 10 elementos
      int[] b = new int[10]; //arreglo de b para 10 elementos
      int[] c = new int[20]; //arreglo de c para unir  a y b intercalados

      //2. llenar el vector a
        System.out.println("Ingrese los valores para Vector a: ");
      for(int i=0;i<a.length;i++){
          System.out.print((i+1)+" Ingrese numero: ");
          a[i]=entrada.nextInt();
      }
         System.out.println("Ingrese los valores para Vector b: ");
      for(int i=0;i<a.length;i++){
          System.out.print((i+1)+" Ingrese numero: ");
          b[i]=entrada.nextInt();
      }
      //3. vamos mezclar de a y b
      int j=0;    //0<10
      for(int i=0;i<10;i++){
          c[j] = a[i];  //1°A 2°A
          j++; 
          c[j] = b[i];  //1°B 2°B
          j++; 
      }
       
        System.out.println("\n El Tercer arreglo es: ");
        for(int i=0;i<c.length;i++){
            System.out.print(c[i]+" ");
        }
      
      
    }
    
}
