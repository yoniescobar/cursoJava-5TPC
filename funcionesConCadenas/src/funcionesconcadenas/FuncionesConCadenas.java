
package funcionesconcadenas;

import java.util.Scanner;

public class FuncionesConCadenas {

    public static void main(String[] args) {
      
        String cadena = "Maria Angelica Gomez Cotoc";
        
        
        System.out.println("Longitud de cadena: "+cadena.length());
        System.out.println("Subcadena del 14 - 20: "+cadena.substring(13,20));
        System.out.println("Mayuscula: "+cadena.toUpperCase());
        System.out.println("Minuscula: "+cadena.toLowerCase());
        System.out.println("Letra Primera Inicial de la Oracion: "+cadena.charAt(0));
        System.out.println("Letra Final de la Oracion: "+cadena.charAt(cadena.length()-1));
        System.out.println("Replazar letra 'a' por @ : "+cadena.replace('5', '@'));
        System.out.println("Buscar r : "+ cadena.indexOf("r"));
        
       
        
       
    }
    
}
