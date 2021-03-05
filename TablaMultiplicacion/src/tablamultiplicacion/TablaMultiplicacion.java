
package tablamultiplicacion;

import javax.swing.JOptionPane;

public class TablaMultiplicacion {

    public static void main(String[] args) {
        
        int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Numero Tabla: "));
        
        for(int i=1;i<=10;i++){
            
            System.out.println(numero+" X "+i+" = "+(i*numero));
        }
    }
    
}
