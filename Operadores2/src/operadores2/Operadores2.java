
package operadores2;

import java.util.Scanner;

public class Operadores2 {

    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      double a,b,c,res;
      
        System.out.print("Ingrese los valores de a,b,c: ");
        a = entrada.nextInt();
        b = entrada.nextInt();
        c = entrada.nextInt();
        
        res = Math.pow(a, 2)/b + Math.sqrt(c);
        
        System.out.println("El resultado es: "+res);
      
      
      
    }
    
}
