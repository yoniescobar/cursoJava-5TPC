
package programa10;
import java.util.Scanner;
public class Programa10 {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       int numero;
       
        System.out.print("Ingrese un numero Entero: ");
        numero = entrada.nextInt(); //0
           
        if (numero>0) {
            System.out.println("Entero Positivo");
        }else if(numero==0) {
            System.out.println("Entero Neutro");
        }else{
           System.out.println("Entero Negativo");
        }
      
    }
    
}
