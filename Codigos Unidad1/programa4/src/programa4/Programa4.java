
package programa4;

import java.util.Scanner;

public class Programa4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final double pi=3.1416;
        double volumen,radio,area;
        
        System.out.print("Ingrese el Radio de la Esfera: ");
        radio = entrada.nextDouble();
        //calculos
        volumen = 4/3*pi*Math.pow(radio, 3);
        area = 4*pi*Math.pow(radio, 2);
        //salida
        System.out.println("El volumen de la Esfera es: "+volumen);
        System.out.println("El Area de la Esfera es : "+area);

    } 
}
