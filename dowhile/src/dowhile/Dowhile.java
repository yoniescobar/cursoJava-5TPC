
package dowhile;

import java.util.Scanner;

public class Dowhile {

  
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int numero=0,suma=0;
        
        do {   
            System.out.println("Ingrese un numero: ");
            numero = entrada.nextInt();
            suma = suma+numero;
            System.out.println("La suma es: "+suma);
            
        } while (numero!=0);
        
     //   System.out.println("La suma es: "+suma); 
        
    }
    
}
