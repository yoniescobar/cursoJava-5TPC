
package programa20;

import java.util.Scanner;


public class Programa20 {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
      //1. Declar variables
      String nombre;
      int tipoC,cantidad;
      double costo,descuento,subtotal,totalPago;
      
      //2. Entrada de datos
        System.out.print("Ingrese el Nombre del Cliente: ");
        nombre = entrada.nextLine();
        System.out.print("Tipo de Cliente (1) (2)  o (3): ");
        tipoC = entrada.nextInt();
        System.out.print("Ingrese Cantidad de Libros: ");
        cantidad = entrada.nextInt();
        System.out.print("Ingrese Costo de libros: ");
        costo = entrada.nextDouble();
      //3. proceso
      subtotal = cantidad*costo;
      if(tipoC==1){
        descuento = subtotal*0.30;
      }else if(tipoC==2){
        descuento = subtotal*0.20;
      }else if(tipoC==3){
       descuento = subtotal*0.10;
      }else{
        descuento=0;
      }
      
      totalPago= subtotal-descuento;
      
      //Salida
        System.out.println("\n==========Detalle de Pago===========");
        System.out.println("Nombre del Cliente: "+nombre);
        System.out.println("Subtotal Q."+subtotal);
        System.out.println("Descuento Q."+descuento);
        System.out.println("Total a Pagar Q. "+totalPago);
    }
    
}
