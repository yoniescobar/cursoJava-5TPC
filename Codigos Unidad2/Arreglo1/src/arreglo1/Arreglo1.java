
package arreglo1;

import java.util.Scanner;

public class Arreglo1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cantAlumnos,posAlumnoMayor=0,posAlumnoMenor=0;
        double alturaMax=0,alturaMin=5.0;
        
        System.out.print("Digite la Cantidad de Alumnos: ");
        cantAlumnos = entrada.nextInt();
        //1. Declarar el vector
        double[] estatura = new double[cantAlumnos];
        
        //2. llenar Vector
        for(int i=0;i<cantAlumnos;i++){
            System.out.print("Digite la Estatura del Alumno"+(i+1)+": ");
            estatura[i]=entrada.nextDouble();
         
        }
        
        //3. Obtener Mayor y menor
         for(int x=0;x<cantAlumnos;x++){
             if(estatura[x]>alturaMax){
                alturaMax = estatura[x];
                 posAlumnoMayor =x+1;
                }else{
                    if(estatura[x]<alturaMin){
                        alturaMin=estatura[x];
                        posAlumnoMenor=x+1;
                    }
                 }
        
         }
        System.out.println("\n .:. Resultado .:. ");
        System.out.println("Altura Mayor es: "+alturaMax+" Alumno: "+posAlumnoMayor);
        System.out.println("Altura Menor es: "+alturaMin+" Alumno: "+posAlumnoMenor);
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
