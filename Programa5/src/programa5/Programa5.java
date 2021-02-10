
package programa5;

import java.util.Scanner;

public class Programa5 {

   
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      final int salariob=1000;
      int nCarrosVendidos;
      float precioCarro,salarioTotal,comision; 
      
        System.out.print("Ingrese el total de carros vendidos: ");
        nCarrosVendidos = entrada.nextInt();
        System.out.print("Ingrese el costo del Carro: ");
        precioCarro = entrada.nextInt();
        //             1000 +  300+ 5000
        
        comision = 0.05f *precioCarro*nCarrosVendidos;
        salarioTotal = salariob + (nCarrosVendidos*150)+ comision;
      
        System.out.println("El salario Total es: "+salarioTotal);  //6300
    }
    
}
