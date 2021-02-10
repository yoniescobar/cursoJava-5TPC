
package operadores;

import java.util.Scanner;

public class Operadores {

   
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       float n1,n2,suma,resta,mult,div,modulo;    //1. declarar varibles
       
        System.out.print(" Digite 2 numeros: ");  //2. ingreso de datos
        n1 = entrada.nextFloat();
        n2 = entrada.nextFloat();
       
        //3. calcular datos--proceso
        suma = n1+n2;
        resta = n1-n2;
        mult = n1*n2;
        div = n1/n2;
        modulo = n1%n2;
        //4. salida de dato
        System.out.println("\n\nLa suma es: "+suma);
        System.out.println("La Resta es: "+resta);
        System.out.println("La Multiplicacion: "+mult);
        System.out.println("La División es: "+div);
        System.out.println("El Reciduo es: "+modulo);

    }
    
}
