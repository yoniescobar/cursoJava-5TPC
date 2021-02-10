package programa16;

import java.util.Scanner;

public class Programa16 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion; //1. declarar variables

        //2. Entrada de datos
        System.out.println(" **** M E N U   P R I N C I P A L ****");
        System.out.println("1. Deposito");
        System.out.println("2. Retiro");
        System.out.println("3. Consultar Saldo");
        System.out.println("4. Salir");
        System.out.println(" Ingrese una Opción Valida: ");
        opcion = entrada.nextInt();

        //3. Proceso
        switch (opcion) {
            case 1:
                System.out.println("==== Deposito =====");
                break;
            case 2:
                System.out.println("==== Retiro =====");
                break;
            case 3:
                System.out.println("==== Cosulta de Saldo =====");
                break;
            case 4:
                System.out.println("==== Bi hasta Pronto!! =====");
                break;
                
            default: 
                System.out.println("Error el Dato Ingresado no es Valido!!");
                break;
        }

    }

}
