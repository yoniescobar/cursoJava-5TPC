
package repasosumamatrices;

import java.util.Scanner;

public class RepasoSumaMatrices {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       int matrizA[][],matrizB[][],suma[][],orden,acumulado=0;
       
        System.out.print("Ingrese el orde de la Matriz: ");
        orden = entrada.nextInt();
        
         matrizA = new int[orden][orden];  //declarar el tamaño de la matriz
         matrizB = new int[orden][orden];
         suma    = new int[orden][orden];
         
         System.out.println("Llenar la Matriz A: ");
         //llenar la matrizA
         for(int i=0;i<orden;i++){ //recorrer las filas
             for(int j=0;j<orden;j++){ //recorre las columnas
                 System.out.print("MatrizA ["+i+"]["+j+"]: ");
                 matrizA[i][j] = entrada.nextInt();
             }
         }
         
         System.out.println("\n Llenar la Matriz B: ");
         //llenar la matrizB
         for(int i=0;i<orden;i++){ //recorrer las filas
             for(int j=0;j<orden;j++){ //recorre las columnas
                 System.out.print("MatrizB ["+i+"]["+j+"]: ");
                 matrizB[i][j] = entrada.nextInt();
             }
         }
         
         //suma de matriz A + matriz B
         
         for(int i=0;i<orden;i++){ //recorrer las filas
             for(int j=0;j<orden;j++){ //recorre las columnas
                suma[i][j]= matrizA[i][j] +  matrizB[i][j];
             }
         }
         
        
         System.out.println("\n Suma de MatrizA   +  MatrizB: ");
         
         for(int i=0;i<orden;i++){ //recorrer las filas
             for(int j=0;j<orden;j++){ //recorre las columnas
                 System.out.print(suma[i][j]+ "\t ");
                 
             }
             System.out.println("");
         }
         
         System.out.println("\n Valores de la Primera Diagonal ");
         
         for(int i=0;i<orden;i++){ //recorrer las filas
             for(int j=0;j<orden;j++){ //recorre las columnas
                 
//                 if(i==j){ //Primera Diagonal
//                  System.out.print(suma[i][j]+ "\t ");
//                  acumulado = acumulado + suma[i][j];
//                 }
                 if(i+j==suma.length-1){ //Segunda diagonal
                 System.out.print(suma[i][j]+ "\t ");
                  acumulado = acumulado + suma[i][j];
                 }

             }
            
         }
        
         System.out.println("La suma de la Digonal Principal es: "+acumulado);
         
    }
    
}
