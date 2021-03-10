
package foranidadocalificaciones;

import java.util.Scanner;


public class ForanidadoCalificaciones {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Declar variables
        String nombre,curso;
        int nota,prom,aprobado=0,noAprobados=0,cantAlumnos,suma;
        
        System.out.print("¿Cuantos Alumnos Desea Ingresar ?: ");
        cantAlumnos = entrada.nextInt();
        System.out.println("");
        
        for(int i=1;i<=cantAlumnos;i++){
            System.out.print("Ingrese Nombre Estudiante: ");
            nombre = entrada.nextLine();
            entrada.nextLine(); //limpiamos buffer de entrada.
            System.out.print("Ingrese Nombre Curso: ");
            curso = entrada.nextLine();
               prom =0;
               suma =0;
              for(int j=1;j<=4;j++){
                  System.out.print("Unidad "+j+":");
                  nota= entrada.nextInt();  //80 90 70 50 = 290
                  suma+=nota; //290
              }
              prom = suma/4;
              System.out.println(" Promedio: "+prom);
              System.out.println("");
        
        }
        
        
        
        
    }
    
}
