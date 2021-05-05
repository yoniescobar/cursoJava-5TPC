
package cuadromagico3x3;

import java.util.Scanner;

public class CuadroMagico3x3 {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        int numero,sumaFila=0,sumaColumna=0;
        int[][] matriz = new int[3][3];
        
        System.out.println("Ingrese los números a la Matriz");
        //Llenar la Matriz
        for(int i=0;i<matriz.length;i++){ //Recorremos las filas
            for(int j=0;j<matriz.length;j++){ //Recorremos las columnas
                System.out.print("Ingrese el valor en la posicion ["+i+"]["+j+"]: ");
                numero = entrada.nextInt();
                matriz[i][j]= numero;
            }
        }
        
        //Mostrar los valores  Matriz
        System.out.println("\n.:.Matriz Ingresada.:.\n");
        for(int i=0;i<matriz.length;i++){ //Recorremos las filas
            for(int j=0;j<matriz.length;j++){ //Recorremos las columnas
                System.out.print(matriz[i][j] + "\t");
                
            }
            System.out.println("");
        }
        
        System.out.println("Suma de Filas");
        //sumar las filas de la matriz
        for(int i=0;i<matriz.length;i++){ //Recorremos las filas
            for(int j=0;j<matriz.length;j++){ //Recorremos las columnas
                   sumaFila = sumaFila+matriz[i][j];
            }
            System.out.println(i+"Fila "+"= "+sumaFila);
            sumaFila=0;
        }
        
        System.out.println("Suma de Columnas");
        //sumar las columna de la matriz
        for(int i=0;i<matriz.length;i++){ //Recorremos las filas
            for(int j=0;j<matriz.length;j++){ //Recorremos las columnas
                   sumaColumna = sumaColumna+matriz[j][i];
            }
            System.out.println(i+"columnas "+"= "+sumaColumna);
            sumaColumna=0;
        }
       
    }
    
}
