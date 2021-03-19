
package factorial;

import javax.swing.JOptionPane;

public class Factorial {

    public static void main(String[] args) {
       //1. declarar variables
        int numero;
       long factorial = 1;
       
       //2. ingreso de datos
       numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
      
       //3. Proceso    
       for(int i=1;i<=numero;i++){
           factorial *=i; //1*2*3*4*5 = 120
       }
       
        System.out.println("El fatorial de "+numero+" es "+factorial);
       
    }
    
}
