
package adivinarnumero;

import javax.swing.JOptionPane;

public class AdivinarNumero {

    public static void main(String[] args) {
      int aleatorio,numero,intentos=0;
      
      
      aleatorio = (int)(Math.random()*100);  
      
        do{
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero Entero : "));
                //9>9
            if(aleatorio>numero){
                System.out.println("Digite un numero mayor: ");
            }else{
                System.out.println("Digite un numero menor: ");
            }
            intentos++; 
                
        }while(numero!=aleatorio);
        
        System.out.println("\n Haz Ganado en el Intento No. "+intentos);
    }
    
}
