
package ordenamiento;

import java.util.Scanner;

public class OrdenamientoBurbuja {
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      int numElementos,aux;
        
      System.out.print("Digite cantidad de elementos  a Ingresar: ");
      numElementos = entrada.nextInt();
       
       int[] numeros = new int[numElementos]; //1. Declarar tamaño arreglo
       
       // 2. llenar con los valores enteros el arreglo
       for(int i=0;i<numElementos;i++){
           System.out.print((i+1)+"- Ingrese numeros: ");
           numeros[i] = entrada.nextInt();
       }
       
       //3. Metodo de ordenamiento Burbuja 
       for(int i=0;i<(numElementos-1);i++){ //for 1 recorre el vector
           for(int j=0;j<(numElementos-1);j++){  //for 2 compara  si izq>Derecho
                if(numeros[j]>numeros[j+1]){
                     aux = numeros[j];
                     numeros[j]= numeros[j+1];
                     numeros[j+1]=aux;
                }
           }
       }
       
       //4. Mostrar el arreglo ordenado
        System.out.println("\n Orden de forma Ascendente: ");
        for(int i=0;i<numElementos;i++){
            System.out.print(numeros[i]+" ");
        }
        System.out.println("");
        
        
         //5. Mostrar el arreglo ordenado descendent4e
        System.out.println("\n Orden de forma Descendente: ");
        for(int i=(numElementos-1);i>=0;i--){
            System.out.print(numeros[i]+" ");
        }
        System.out.println("");
       
       
       
    }
    
}
