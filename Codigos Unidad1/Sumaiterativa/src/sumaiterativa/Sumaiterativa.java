
package sumaiterativa;

import javax.swing.JOptionPane;

public class Sumaiterativa {

    public static void main(String[] args) {
         //1. declarar variables
         int numero,contador=0,acum=0;
         float promedio;
         
         do{
              numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
              if(numero>=0){
                contador++;
                acum=acum+numero;
              }
             
         }while(numero>=0);
         
         promedio = (float)acum/contador;
        
         System.out.println("suma: "+acum);
          System.out.println("Promedio: "+promedio);
         
    }
    
}
