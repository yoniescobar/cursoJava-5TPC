
package repasoexamen3;

import java.util.Scanner;

public class RepasoExamen3 {

    
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       int suma=0,numero;
       
       for(int i=1;i<=10;i++){
           System.out.print("Ingrese numero No. "+i+": ");
           numero = entrada.nextInt();
           suma = suma + numero;
       }
       
        System.out.println("La suma es: "+suma);
       
    }
    
}
