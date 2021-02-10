
package programa3;

import java.util.Scanner;


public class Programa3 {

  
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       float guillermo,luis,juan,total;
       
        System.out.print("Ingrese la cantidad de Dolares que tienen Guillermo: ");
        guillermo = entrada.nextFloat();
        
        luis = guillermo/2; // 50           Luis tiene la mida de lo que tiene guillermo  
        juan = (guillermo+luis)/2; //75
        total = guillermo+luis+juan; //100+50+75
       
        System.out.println("El Total de Dolares es: "+total);
    }
    
}
