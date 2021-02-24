
package programabucle1;

import javax.swing.JOptionPane;

public class ProgramaBucle1 {

    public static void main(String[] args) {
       /* hacer un programa que lee un numero y mostrar su cuadrado
        repetir el proceso hasta que se introduzca un numero negativo
          y el cuadrado 4
       5  y el cuadrado 25 pow(numero,2)*/
       
       int numero,cuadrado;
       
       numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
       
       while(numero>=0){
           cuadrado = (int) Math.pow(numero,2);
           JOptionPane.showMessageDialog(null,"El numero "+numero+" su cuadrado es: "+cuadrado);
       
           numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero: "));
      
       }
       
       
       
    }
    
}
