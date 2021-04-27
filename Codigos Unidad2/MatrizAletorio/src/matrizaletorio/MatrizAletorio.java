
package matrizaletorio;

import java.util.Scanner;

public class MatrizAletorio {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nFilas,nColumnas;
        int matriz[][],numAleatorio,suma=0;
        
        System.out.print("Ingrese numero de filas: ");
        nFilas = entrada.nextInt();
        System.out.print("Ingrese numero de columnas: ");
        nColumnas = entrada.nextInt();
        
        matriz = new int[nFilas][nColumnas]; //definiendo el tamaño de la matriz
        
        //llenar la matriz con numeros aleatorios.
        for(int i=0;i<nFilas;i++){ //recorre filas
            for(int j=0;j<nColumnas;j++){ //recorre columnas
                numAleatorio = (int)(Math.random()*100);  // genera los numeros aleatorios 78
                matriz[i][j] = numAleatorio;
                suma = suma + matriz[i][j] ;
            }                  
        }
        
        System.out.println("\n La Matriz Aleatorio de  "+nFilas+" x "+nColumnas+"\n");
        //imprimiendo los valores de la matriz
        for(int i=0;i<nFilas;i++){ //recorre filas
            for(int j=0;j<nColumnas;j++){ //recorre columnas
                
                System.out.print(matriz[i][j]+"\t ");
            }   
            System.out.println("");
        }
        
        System.out.println("\n La sumatoria es: "+suma);
        
        
    }
    
}
