
package sumadiagonales;

import java.util.Scanner;
import java.*;

public class SumaDiagonales {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       int matrizA[][];
       int n,numero,sumD1=0,sumD2=0;
       
        System.out.print("Ingrese el Tamaño de la Matriz Cuadrada: ");
        n= entrada.nextInt();
        matrizA = new int[n][n]; //Definiendo el tamaño de la matriz
        int sumaFilas[] = new int[n];
        
        //llenar la matriz con numeros aletorios del 1 al 100
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                numero = (int)(Math.random()*100); //cast es forzar a que sea un entero
                
                matrizA[i][j] = numero;
            }
        }
        
         System.out.println("Mostrando la Matriz");
         for(int i=0;i<n;i++){
              for(int j=0;j<n;j++){
                
                System.out.print(matrizA[i][j]+"\t ");
                
              }
            System.out.println("");  
        }
    
       
        System.out.println("\nValores de la Diagonal 1: ");
        //Mostrar los valores de las diagonal 1
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               if(i==j){
                   System.out.print(matrizA[i][j]+"  ");
                   sumD1+= matrizA[i][j];
               }
            }
        
        }
       
        
         System.out.println("\nValores de la Diagonal 2: ");
        //Mostrar los valores de las diagonal 1
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               if(i+j==(n-1)){
                   System.out.print(matrizA[i][j]+"  ");
                   sumD2 = sumD2 + matrizA[i][j];
               }
            }
        
        }
        
        System.out.println("\n\nSuma de D1: "+sumD1);
        System.out.println("Suma de D2: "+sumD2);
        
        
    }
    
}
