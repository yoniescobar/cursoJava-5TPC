
package matrizcuadrada;

import java.util.Scanner;

public class MatrizCuadrada {

    
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
        int n;
        int matrizB[][];
        
        System.out.print("Ingrese Orden de la Matriz: ");
        n = entrada.nextInt();  //ingrese el tamaño cuadrado de la matriz
       
           matrizB = new int[n][n]; //definiendo la matriz
           
           
            //llenar la Diagonal principal de 1 si i==j y los demas con 0
           for(int i=0;i<n;i++){  
            for(int j=0;j<n;j++){
                 if(i==j){
                   matrizB[i][j]=1;
                 }else{
                   matrizB[i][j]=0;
                 }
            }
           }
           
           //imprimir la matriz llenada anteriormente
           
           System.out.println("Impresion de Matriz ");
           for(int i=0;i<n;i++){   
            for(int j=0;j<n;j++){
                 System.out.print(matrizB[i][j]+"\t ");
            }
               System.out.println("");
           }
           
      
        
    }
    
}
