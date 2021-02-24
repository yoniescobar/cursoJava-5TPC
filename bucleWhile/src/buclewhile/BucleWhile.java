
package buclewhile;

import javax.swing.JOptionPane;

public class BucleWhile {

    public static void main(String[] args) {
      
      
      int contador;
      
      contador = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
      
                   
           while(contador>=1){
               System.out.println(contador);  
                contador--;  
           }
        
    }
    
}
