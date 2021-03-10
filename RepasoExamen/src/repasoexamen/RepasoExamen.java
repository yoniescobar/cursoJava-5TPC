
package repasoexamen;

import java.util.Scanner;


public class RepasoExamen {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //1. Declarar variables
        int n1,n2,aux;
        //2. Ingreso de Datos
        System.out.print("Ingrese Valor 1: ");
        n1 = entrada.nextInt();  //200
        System.out.print("Ingrese Valor 2: ");
        n2 = entrada.nextInt();  //500
        
        //3. Proceso
        aux = n1;   // aux =0
        n1 = n2;    // n1 = 500
        n2 = aux;   // n2 = 200 
        
        //4. salida
            System.out.println("El nuevo  Valor1 es: "+n1);
            System.out.println("El nuevo  Valor2 es: "+n2);
        
        
        
    }
    
}
