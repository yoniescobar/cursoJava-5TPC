
package ciclodowhile;

import javax.swing.JOptionPane;

public class CicloDowhile {

    
    public static void main(String[] args) {
       
       // int j=20;
       int contador;
        contador = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
         //8
        do{
        
            System.out.println(contador);   //8, 7 6..
            contador--; //6
                      
               //6
        }while(contador>=1);
        
    }
    
}
