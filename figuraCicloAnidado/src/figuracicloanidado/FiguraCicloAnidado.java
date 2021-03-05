
package figuracicloanidado;

import javax.swing.JOptionPane;

public class FiguraCicloAnidado {

    public static void main(String[] args) {
        //1. Declarar Variables
        int altura;
        
        altura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Altura del la figura: "));
        //5     i=6   6<=5
        for(int i=1;i<=altura;i++){ //filas
                      //1<=5  
           for(int j=1;j<=i;j++){ //columna
            System.out.print("*");
           }
           
            System.out.println("");
        }
    }
    
}
