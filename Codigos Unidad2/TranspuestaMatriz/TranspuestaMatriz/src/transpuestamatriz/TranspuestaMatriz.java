
package transpuestamatriz;

import java.util.Scanner;

public class TranspuestaMatriz {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       int col,fila;
       int matrizA[][], matrizT[][];
       
        System.out.print("Ingrese el numero filas: ");
        fila = entrada.nextInt();
        System.out.print("Ingrese el numero Columnas: ");
        col = entrada.nextInt();
        
                matrizA = new int[fila][col];
        System.out.println("Ingrese los valores de la Matriz A: ");
        
        for(int i=0;i<fila;i++){ //recorremos fila    //llenando la Matriz
            for(int j=0;j<col;j++){ //recrremos columnas
                System.out.print(" Matriz A ["+i+"]["+j+"]: ");
               matrizA[i][j] = entrada.nextInt();
            }
        }
        
        System.out.println("Matriz A ");
         for(int i=0;i<fila;i++){ //recorremos fila    //llenando la Matriz
            for(int j=0;j<col;j++){ //recrremos columnas
                System.out.print(matrizA[i][j]+"\t");
            }
             System.out.println("");
        }
        
        //Proceso para hacer la matriz transpuesta
            matrizT = new int[col][fila];
        for(int j=0;j<col;j++){ //recorremos columnas
          for(int i=0;i<fila;i++){ //rerromos filas
              matrizT[j][i]= matrizA[i][j];
          }
        }
       //imprimir resultado de transpuesta
       System.out.println("Transpuesta de la Matriz A ");
       for(int j=0;j<col;j++){ //recorremos columnas
          for(int i=0;i<fila;i++){ //rerromos filas
              System.out.print(matrizT[j][i]+"\t");
          }
           System.out.println("");
        }
    }
    
}
