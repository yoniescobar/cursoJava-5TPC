
package apprestaurante;

import javax.swing.JOptionPane;

public class AppRestaurante {

    public static void main(String[] args) {
        //1. la variables
        int combo;
        double descuento,totalPagar;
        //2. Ingreso
        
        combo = Integer.parseInt(JOptionPane.showInputDialog(" Restaurante MaccDonald\n"
                + "\n Combo 1 Q.50:  Big Mac 10% Descuento"
                + "\n Combo 2 Q.45:  Mcnuggets 15% Descuento"
                + "\n Combo 3 Q.35:  Quesoburguesa 8% de Descuento"
                + "\n Combo 4 Q.30:  Cajita feliz 5% "
                + "\n Salir 5: "
                + "\n Elija un Combo: "));
        
           switch(combo){
               case 1:
                   descuento = 50 * 0.10;
                   totalPagar = 50 - descuento;
                   JOptionPane.showMessageDialog(null," Total a paga: "+totalPagar);
                   break;
              case 2:
                   descuento = 45 * 0.15;
                   totalPagar = 45 - descuento;
                   JOptionPane.showMessageDialog(null," Total a paga: "+totalPagar);
                   break;
          
                  case 3:
                   descuento = 35 * 0.08;
                   totalPagar = 35 - descuento;
                   JOptionPane.showMessageDialog(null," Total a paga: "+totalPagar);
                   break;
                 
                 case 4:
                   descuento =30 * 0.05;
                   totalPagar = 30 - descuento;
                   JOptionPane.showMessageDialog(null," Total a paga: "+totalPagar);
                   break;  
                 case 5: break;
                 default: JOptionPane.showMessageDialog(null, "La opcion no es valida..");
               
                 
                   
           }
    }
    
}
