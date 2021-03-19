
package sueldoempleado;

import java.util.Scanner;

public class SueldoEmpleado {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        float horasTrabajadas;
        float salarioHora,totalSueldo; //1. declarar variables
        
        //2. ingreso de datos
        System.out.print("Ingrese Horas Trabajadas: ");
        horasTrabajadas= entrada.nextInt();
        System.out.print("Ingrese Salrio por Hora Q. ");
        salarioHora = entrada.nextInt();
        
        //3. proceso -- Calculos
        totalSueldo = horasTrabajadas*salarioHora;
        
        //4. salida de datos
        System.out.println("El total sueldo es: Q. "+totalSueldo);
        
        
    
    }
    
}
