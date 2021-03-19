
package sueldomayor;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class SueldoMayor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //1. Declarar variables
        float  sueldo,sueldoMayor=0;
        int nSueldo;
        
        //2. Ingreso de Datos
        nSueldo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese número de Sueldo: "));
        
        //3. proceso
        for(int i=1;i<=nSueldo;i++){
            System.out.print("Sueldo No. "+i+"Q. ");
            sueldo = entrada.nextFloat();
            if(sueldo>sueldoMayor){
                sueldoMayor = sueldo;
            }
        }
        
         System.out.println("El sueldo Mayor es: "+sueldoMayor);
        
        
    }
    
}
