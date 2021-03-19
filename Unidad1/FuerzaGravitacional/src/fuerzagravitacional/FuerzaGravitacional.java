
package fuerzagravitacional;

import java.util.Scanner;

public class FuerzaGravitacional {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        final double G = 6.673*Math.pow(10, -8);
        double m1,m2,d,f;
        
        System.out.print("Ingrese M1: ");
        m1 = entrada.nextDouble();
        System.out.print("Ingrese M2: ");
        m2 = entrada.nextDouble();
        System.out.print("Ingrese la distacina de los Cuerpo: ");
        d = entrada.nextDouble();
        
        
        f= (G*m1*m2)/(Math.pow(d, 2));
        
        System.out.println("Fuerza gravitacioal: "+f);
        
        
        
        
    }
    
}
