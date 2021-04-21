
package plan;

import java.util.Scanner;

public class Plan {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       int contarPares=0,contarImpares=0;
       int[] numeros = new int[10];
       
        System.out.println("Ingresar datos al Vector");
       for(int i=0;i<10;i++){
           System.out.println((i+1)+"Ingrese numero: ");
           numeros[i]=entrada.nextInt();
           if(numeros[i]%2==0){
               contarPares++;
           }else{
               contarImpares++;
           }
       }
       
       //creamos los vectores nuevos de pares e impares
       int[] v2 = new int[contarPares];
       int[] v3 = new int[contarImpares];
       
       contarPares=0;
       contarImpares=0;
       //cargamos vectores de pare e impares
       for(int i=0;i<10;i++){
          if(numeros[i]%2==0){
               v2[contarPares]=numeros[i];
               contarPares++;
           }else{
               v3[contarImpares]=numeros[i];
               contarImpares++;
           }
       }
       
      
        System.out.print("\n Vectores de Pares: ");
        for (int i = 0; i < contarPares; i++) {
            System.out.print(v2[i]+"  ");
        }
        System.out.println("");
        
        System.out.print("\n Vectores de Impares: ");
        for (int i = 0; i < contarPares; i++) {
            System.out.print(v3[i]+"  ");
        }
        System.out.println("");
       
    }
    
}
