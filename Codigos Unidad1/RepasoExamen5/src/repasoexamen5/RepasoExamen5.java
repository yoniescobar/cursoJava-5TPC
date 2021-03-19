
package repasoexamen5;

import java.util.Scanner;

public class RepasoExamen5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //1. Declaracion de Variables
        String nombre;
        int tipo,cantidad;
        float descuento=0,descAdicional=0,subtotal,totalPagar,precioUnit;
        
        //2. Leer las variables
        System.out.print("Cliente: ");
        nombre = entrada.nextLine();
        System.out.print("Ingrese tipo Cliente 1-2-3: ");
        tipo = entrada.nextInt();
        System.out.print("Ingrese Cantidad: ");
        cantidad = entrada.nextInt(); //75
        System.out.print("Precio Unitario: ");
        precioUnit = entrada.nextFloat();
        
        //Proceso Calculo
        subtotal = cantidad * precioUnit;
        //tipo cliente
        if(tipo==1){
          descuento = (float)(subtotal * 0.30);
        }else if(tipo==2){
          descuento = (float)(subtotal * 0.20);
        }else if (tipo==3){
         descuento = (float)(subtotal * 0.10);
        }
        
        //Descuento adicional
           //68>100
        if(cantidad>100 ){
            descAdicional = (float)(subtotal * 0.10);
        }else if(cantidad>50){
            descAdicional = (float)(subtotal * 0.05);
        }
        
           //400          //500 - // 80 + 20
         totalPagar = subtotal - (descuento + descAdicional);
        //salida
        System.out.println("\n\n ----- Detalle de Factura ----- ");
        System.out.println("Cliente: "+nombre);
        System.out.println("Subtotal: "+"%.2f"+subtotal);
        System.out.println("Descuento: "+descuento);
        System.out.println("Descuento Adicional: "+descAdicional);
        System.out.println("Total a Pagar: "+totalPagar);
        
        
        
        
        
        
    }
    
}
