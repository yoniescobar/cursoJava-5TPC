
package programa11;

import java.util.Scanner;


public class Programa11 {

    
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       char letra;
       String res;
       
        System.out.print("Ingrese una letra minuscula: ");
        letra = entrada.next().charAt(0);
        
        if(letra =='a' || letra=='e' || letra=='i' ||letra=='o'||letra=='u' ){
            System.out.println("Es una vocal");
        }else{ 
            System.out.println("No es vocal");
        }
        
        
       
       
       
    }
    
}
