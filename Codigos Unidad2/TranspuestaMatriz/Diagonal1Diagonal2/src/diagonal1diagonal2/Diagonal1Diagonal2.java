
package diagonal1diagonal2;

import java.util.Scanner;

public class Diagonal1Diagonal2 {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       int matrizA[][];
       int n;
       
        System.out.print("Ingrese el Tamaño de la Matriz Cuadrada: ");
        n= entrada.nextInt();
        matrizA = new int[n][n];
        //llenar la primera diagonal de 1 y 2
        for(int i=0;i<n;i++){  //recorre las filas
           for(int j=0;j<n;j++){ //recorre las columnas
               
               if(i==j || i+j==(n-1) ){ 
                 matrizA[i][j]=1;
               }else{
                 matrizA[i][j]=0;
               }
           }
        }
        
       
        
        System.out.println("\n Resultado de la Matriz ");
         for(int i=0;i<n;i++){  //recorre las filas
           for(int j=0;j<n;j++){ //recorre las columnas
               System.out.print(matrizA[i][j]+"\t");
           }
             System.out.println("");
        }
        
       
       
    }
    
}
