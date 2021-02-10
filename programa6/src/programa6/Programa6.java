package programa6;
import java.util.Scanner;
public class Programa6 {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       float part,p1,p2,examenF,notaFinal;  //1. declarar variables
       //2. ingreso de datos
        System.out.print("Ingrese Nota de Participacion: ");
        part = entrada.nextFloat();
        System.out.print("Ingrese Nota de Parcial 1: ");
        p1 = entrada.nextFloat();
        System.out.print("Ingrese Nota de Parcial 2: ");
        p2 = entrada.nextFloat();
        System.out.print("Ingrese Nota de Examen Final: ");
        examenF = entrada.nextFloat();
        //proceso    --- calculos
        part= part *0.10f;  //10
        p1 = p1 * 0.25f;    //25
        p2 = p2 *0.25f;     //25
        examenF = examenF*0.40f;  //40
        notaFinal = part + p1 + p2 + examenF;
        
        System.out.println("Tu nota final es: "+notaFinal);
    }  
}
