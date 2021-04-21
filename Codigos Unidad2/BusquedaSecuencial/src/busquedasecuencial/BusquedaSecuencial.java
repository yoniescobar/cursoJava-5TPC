package busquedasecuencial;

import java.util.Scanner;

public class BusquedaSecuencial {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] arreglo = {20, 30, 40, 50, 60, 70, 80};
        int dato, i;
        boolean encontrado = false;

        System.out.print("Ingrese numero a Buscar: ");
        dato = entrada.nextInt();

        for (i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == dato) {
                encontrado = true;
                break;
            }
        }

        if (encontrado == true) {
            System.out.println("El dato fue encontrado.. en la posicion:" + (i));
        } else {
            System.out.println("El dato No fue encontrado...");

        }
    }
}
