
package contarhastan;

import javax.swing.JOptionPane;

public class ContarhastaN {

    public static void main(String[] args) {
       int i,numero;
       
       numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
     //8
       
       i=1;  
       while(i<=numero){
           System.out.println(i);
           i++;
       }
       
    }
    
}
