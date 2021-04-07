/* Leer 5 numeros por teclado, almacenarlo y obterner el promedio
   numeros positivos, numeros negativos y contar los ceros.
 */
package arreglo4;

import java.util.Scanner;

public class Arreglo4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //1. Declarar mis variables
        float[] numeros = new float[5];
        float suma = 0, promedio=0, contPos = 0, contNeg = 0, contCeros=0;

        //2. llenar el vector
        System.out.println("Ingrese 5 numeros :");
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el numero" + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();

            if (numeros[i] > 0) {
                contPos++;    //contar positivos 
            }
            if (numeros[i] < 0) {
                contNeg++;
            }
            if (numeros[i] == 0) {
                contCeros++;
            }
            suma = suma + numeros[i];
            promedio = suma / 5;   //calcacular media.

        }
        
        System.out.println("\n---- Imprimiendo Resultados ------\n");
        System.out.println("Promedio: "+promedio);
        System.out.println("Cant Positivos: "+contPos);
        System.out.println("Cant Negativos: "+contNeg);
        System.out.println("Cant Ceros: "+contCeros);
        
        

    }

}
