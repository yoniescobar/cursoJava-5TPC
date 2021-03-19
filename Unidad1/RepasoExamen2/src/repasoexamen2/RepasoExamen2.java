
package repasoexamen2;

import java.util.Scanner;

public class RepasoExamen2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //1. declaracion de variables
        String nombre,curso;
        int b1,b2,b3,b4;
        float prom;
        
        //2. Ingreso de datos
        System.out.print("Ingrese nombre del Estudiante: ");
        nombre = entrada.nextLine();
        System.out.print("Ingrese nombre del Curso: ");
        curso = entrada.nextLine();
        System.out.print("B1: ");
        b1 = entrada.nextInt();
        System.out.print("B2: ");
        b2 = entrada.nextInt();
        System.out.print("B3: ");
        b3 = entrada.nextInt();
        System.out.print("B4: ");
        b4 = entrada.nextInt();
        
        //3. proceso
        prom = (b1+b2+b3+b4)/4;
        System.out.println("El Promedio: "+ prom);
        if(prom<60){
            System.out.println("Resultado: Malo");
        }else if((prom>=60) && (prom<=70) ){
            System.out.println("Resultado: Regular");
        }else if((prom>=71) && (prom<=80) ){
            System.out.println("Resultado: Bueno");
        }else{
            System.out.println("Resultado: Excelente");
        }
        
        
        
        
    }
    
}
