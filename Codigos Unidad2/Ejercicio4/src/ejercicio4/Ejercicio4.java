
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

   
    public static void main(String[] args) {
          Scanner entrada = new Scanner(System.in);
          int pares=0,impares=0;
      //1. Declarar el los vectores a utilizar
      int[] a = new int[10]; //arreglo de a para 10 elementos
    
      //2. llenar el vector
       for(int i=0;i<10;i++){
           System.out.print((i+1)+"Digite un numero Entero:");
           a[i] = entrada.nextInt();
       }
      
       //3. Evaluar si es par o impar
       for(int i=0;i<10;i++){
            
           if(a[i]%2==0){
               pares++;
           }else{
               impares++;
           }
          }  
        //4. imprimir resultado,
        int[] b = new int[pares]; //6
        int[] c = new int[impares]; //4
        pares=0;
        impares=0;
        
           //almcenamiento pares e impares
           for(int i=0;i<10;i++){
               if(a[i]%2==0){
                 b[pares]=a[i];
                 pares++;
               }else{
                   c[impares]=a[i];
                   impares++;
               }
           }
           
           System.out.println("Vector pares: ");
           for(int i=0;i<pares;i++){
               System.out.print(b[i] +" ");
           }
       
       
       
      
    }
    
}
