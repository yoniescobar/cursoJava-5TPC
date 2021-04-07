/* Leer 5 numeros, guardalos en un arreglo y mostrarlos en el  orden inverso*/
package arreglo3;

import java.util.Scanner;

public class Arreglo3 {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       float[] numeros = new float[5];
       
        System.out.println("Ingrese 5 numeros: "); //llenar el vector
        for(int i=0;i<5;i++){
            System.out.print("Ingrese el valor "+(i+1)+": ");
            numeros[i]=entrada.nextInt();
        }
        
        System.out.println("Los numeros ingresados fueron:\n "); //Mostrar los datos del  vector
        for(int i=4;i>=0;i--){
            System.out.println("Ingrese el valor "+(i+1)+" : "+numeros[i]);
        }
       
       
    }
    
}
