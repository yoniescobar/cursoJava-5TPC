
package numerobuscar;

import java.util.Scanner;

public class NumeroBuscar {

    public static void main(String[] args) {
           Scanner entrada = new Scanner(System.in);
           int cantNumeros,num;
           boolean elNumeroEsta = false;
           
           System.out.println("Cantidad de Numeros a Digitar: ");
           cantNumeros = entrada.nextInt();
           
           int[] numeros = new int[cantNumeros];
           
           //1. llenar el vector:
           for(int i=0;i<numeros.length;i++){
               System.out.print("Ingrese numero "+(i+1)+": ");
               numeros[i]=entrada.nextInt();
           }
           //2. Buscar
           System.out.println("Ingrese numero a Buscar: ");
           num = entrada.nextInt(); //75
           
           for(int i=0;i<numeros.length;i++){
               if(numeros[i]==num){
                   System.out.println("El numero esta en la posicion "+(i+1));
                   elNumeroEsta=true;
               }
           }
           
           if(elNumeroEsta==false){
               System.out.println("El numero no se Encontro");
           }
           
           
           
           
           
           
    }
    
}
