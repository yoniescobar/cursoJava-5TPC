
package matrizcuadrada;

import java.util.Scanner;

public class MatrizCuadrada {

    
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
        int n;
        int matrizB[][];
        
        System.out.print("Ingrese Orden de la Matriz: ");
        n = entrada.nextInt();
           matrizB = new int[n][n];
           
           for(int i=0;i<n;i++){   //llenar la D1 de 1 y los demas con 0
            for(int j=0;j<n;j++){
                 if(i==j){
                   matrizB[i][j]=1;
                 }else{
                   matrizB[i][j]=0;
                 }
            }
           }
           
           System.out.println("Impresion de Matriz ");
           for(int i=0;i<n;i++){   
            for(int j=0;j<n;j++){
                 System.out.print(matrizB[i][j]+"\t ");
            }
               System.out.println("");
           }
           
      
        
    }
    
}
