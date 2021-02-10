
package programaiva;

import java.util.Scanner;

public class ProgramaIva {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       String articulo;
       double precioNeto,iva,precioTotal;  //1. Declarar variables
       
       //2. Ingreso de datos
        System.out.print("Ingrese el Articulo: ");
        articulo = entrada.nextLine();
        System.out.println("Ingrese el Precio Neto: ");
        precioNeto = entrada.nextDouble();
        
        
        //3. Proceso -- calculos
        iva =(precioNeto/1.12)*0.12;
        precioTotal = precioNeto+iva;
        
        //4. salida de datos
        System.out.println("Iva : "+iva);
        System.out.println("Precio Total Q. "+precioTotal);
        
       
    }
    
}
