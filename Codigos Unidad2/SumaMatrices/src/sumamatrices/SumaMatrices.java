
package sumamatrices;

import java.util.Scanner;

public class SumaMatrices {

    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
        int matrizA[][],matrizB[][],suma[][];
         int orden;
        System.out.print("Ingrese orde de matriz: ");
        orden = entrada.nextInt();
        
        matrizA=new int[orden][orden];
        matrizB=new int[orden][orden];
        suma = new int[orden][orden];
        
        System.out.println("Ingresar valores de Matriz A \n ");
        
        for(int i=0;i<orden;i++){
            for(int j=0;j<orden;j++){
                System.out.print("Matriz A ["+i+"]["+j+"]:");
                matrizA[i][j]=entrada.nextInt();
            }
        }
      
         System.out.println("Ingresar valores de Matriz B \n ");
        
        for(int i=0;i<orden;i++){
            for(int j=0;j<orden;j++){
                System.out.print("Matriz B ["+i+"]["+j+"]:");
                matrizB[i][j]=entrada.nextInt();
            }
        }
        
        //suma de matrices
          for(int i=0;i<orden;i++){
            for(int j=0;j<orden;j++){
                suma[i][j] = matrizA[i][j] + matrizB[i][j];
                
            }
        }
          
          
          System.out.println("\n\n La suma de matriz A   +  Matriz B es: \n");
          for(int i=0;i<orden;i++){
            for(int j=0;j<orden;j++){
                System.out.print(suma[i][j]+"\t");
       
            }
              System.out.println("");
        }
          
      
    }
    
}
