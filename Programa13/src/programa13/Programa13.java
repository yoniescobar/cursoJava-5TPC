
package programa13;

import java.util.Scanner;

public class Programa13 {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       int n1,n2,n3,mayor,menor; //declarar varibales
       
       //ingreso de datos
        System.out.print("Ingrese 3 numeros Enteros: ");
        n1 = entrada.nextInt();
        n2 = entrada.nextInt();
        n3 = entrada.nextInt();
       
        if(n1>n2 && n1>n3){  //mayor
          mayor = n1;
        }else if(n2>n1 && n2>n3){
          mayor = n2;
        }else{
          mayor = n3;
        }
        
        //menor
          if(n1<n2 && n1<n3){  
          menor = n1;
        }else if(n2<n1 && n2<n3){
          menor = n2;
        }else{
          menor = n3;
        }
        
        
        System.out.println("El Mayor de los 3 numeros es: "+mayor);
        System.out.println("El Menor de los 3 numeros es: "+menor);
       
       
    }
    
}
