
package ejercicionotas;

import javax.swing.JOptionPane;

public class EjercicioNotas {

    public static void main(String[] args) {
       int nota,contador=0;
       boolean reprobados = false; 
       
       for(int i=1;i<=5;i++){
          do{
              nota = Integer.parseInt(JOptionPane.showInputDialog("Digite nota del Alumno "+i+": "));
          }while(nota<0 || nota>100);
          
          if(nota<60){
            reprobados = true;
            contador++; 
          }
       }
            
       if(reprobados == true){
           System.out.println("si Existe alumnos Reprobados");
           System.out.println("Y en total son: "+contador);
       }else{
           System.out.println("No hay ningun alumno Reprobado");
       }
       
       
    }
    
}
