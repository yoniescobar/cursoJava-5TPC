
package operadorternario;

import javax.swing.JOptionPane;

public class OperadorTernario {

    public static void main(String[] args) {
       int numero;
       String respuesta;
       
       numero = Integer.parseInt(JOptionPane.showInputDialog(null," Ingrese un numero Entero? "));
       //19
       //Aqui aplicamos el operador Ternario
                              
       respuesta = (numero%2==0)?"Numero Par":"Numero Impar"; 
    
       JOptionPane.showMessageDialog(null,respuesta,"Administrador CEI",3);
    
    }  

}
