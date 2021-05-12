
package matriz2;

import java.util.Scanner;

public class Matriz2 {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       int matriz[][],nFilas,nColumnas;
      
       
        System.out.print("Ingrese numero de Filas: ");
        nFilas = entrada.nextInt();
        System.out.print("Ingrese numero de Columnas: ");
        nColumnas = entrada.nextInt();
        
        matriz = new int[nFilas][nColumnas];
        
        //ingresar los valores de la matriz.
        for(int i=0;i<nFilas;i++){
            for(int j=0;j<nColumnas;j++){
                System.out.print("Ingrese numero ["+i+"]["+j+"]: ");
                matriz[i][j]=entrada.nextInt();
            }
        }
        
        //Mostrar los valores de la matriz
        System.out.println("\n La Matriz Ingresada Fue: ");
         for(int i=0;i<nFilas;i++){
            for(int j=0;j<nColumnas;j++){
                
                System.out.print(matriz[i][j]+ " ");
            }
             System.out.println("");
        }
       
        
        
        
        
        
       
       
    }
    
}
