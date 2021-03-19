
package programa9;

import java.util.Scanner;


public class Programa9 {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       String nombre,curso,res;  //declarar variables
       int n1,n2,n3,n4,prom;
                                //entrada
        System.out.print("Ingrese su Nombre: ");
        nombre = entrada.nextLine();
        System.out.print("Ingrese Curso: ");
        curso = entrada.nextLine();
        System.out.print("Ingrese Nota Unidad 1 : ");
        n1 = entrada.nextInt();
        System.out.print("Ingrese Nota Unidad 2 : ");
        n2 = entrada.nextInt();
        System.out.print("Ingrese Nota Unidad 3 : ");
        n3 = entrada.nextInt();
        System.out.print("Ingrese Nota Unidad 4 : ");
        n4 = entrada.nextInt();
               //Procesos
        prom = (n1+n2+n3+n4)/4;
        
        if(prom>=60){
        res = "Aprobado";
        }else{
        res = "No Aprobado";
        }
       //Salida
        System.out.println(" El promedio es: "+prom);
        System.out.println(" El Resultado es: "+res);
       
       
    }
    
}
