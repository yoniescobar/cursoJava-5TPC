
package ecuacion2grado;

import java.util.Scanner;

public class Ecuacion2grado {

    public static void main(String[] args) {
        Scanner entrada =new  Scanner(System.in);
        double a,b,c,r1,r2;
        
        System.out.print("Ingrese valor a, b, y c: ");
        a = entrada.nextDouble();
        b = entrada.nextDouble();
        c = entrada.nextDouble();
        
        r1 = (-b+Math.sqrt(Math.pow(b, 2)-(4*a*c)))/(2*a);
        r2 = (-b-Math.sqrt(Math.pow(b, 2)-(4*a*c)))/(2*a);
        
        System.out.println("Repuesta R1: "+r1);
        System.out.println("Repuesta R2: "+r2);
        
        
    }
    
}
