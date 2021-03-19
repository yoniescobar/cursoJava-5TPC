/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resultadodenotas;

import javax.swing.JOptionPane;

/**
 *
 * @author YONI
 */
public class ResultadodeNotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nota;
       
        nota = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Nota final: "));
    
        switch(nota){
            case 0..59:
            case 59:
                JOptionPane.showMessageDialog(null,"Deficiente");
                break;
            case 60:
            case 70:
                JOptionPane.showMessageDialog(null,"Regular");
                break;
            case 71:
            case 80:
                JOptionPane.showMessageDialog(null,"Bueno");
                break;
            case 81:
            case 100:
                JOptionPane.showMessageDialog(null,"Excelente");
                break;
                
               default: JOptionPane.showMessageDialog(null,"La nota ingresada no es valida");
               break;
        }
        
    }
    
}
