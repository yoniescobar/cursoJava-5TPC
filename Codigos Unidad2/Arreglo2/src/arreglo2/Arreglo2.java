
package arreglo2;

import java.util.Scanner;


public class Arreglo2 {

    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      int cantidad;

        System.out.print("Ingrese la cantidad de Notas a Digitar: ");
        cantidad = entrada.nextInt();
     
        int[] notas = new int[cantidad];
      
      for(int i=0;i<cantidad;i++){ //llenar el arreglo
          System.out.print("Ingrese nota del Alumno "+(i+1)+": ");
          notas[i] = entrada.nextInt();
      }
      
      //Mostrar Datos del arreglo  
      System.out.println("\nLas Calificaciones Ingresadas fueron: \n");
      for(int i=0;i<cantidad;i++){ //Mostrar datos el arreglo
          System.out.println("Alumno "+(i+1)+": "+notas[i]);
      }
      
    }
    
}
