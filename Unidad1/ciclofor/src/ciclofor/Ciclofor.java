
package ciclofor;

import javax.swing.JOptionPane;

public class Ciclofor {

    
    public static void main(String[] args) {
        
        //for(inicio; condicion; incremento){}
        int contador;
        
        contador = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        
        for(int i=contador;i>=1;i--){ //resumen i+=2
            System.out.println(i); //10 9 8 7....1
        }
    }
    
}
