package usoswitchoptionpane;

import javax.swing.JOptionPane;

public class UsoSwitchOptionPane {

    public static void main(String[] args) {
        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero Entero entre 1 al 5"));

        switch (numero) {
            case 1:
                JOptionPane.showMessageDialog(null, "Es el numero 1");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Es el numero 2");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Es el numero 3");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Es el numero 4");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Es el numero 5");
                break;

            default:
                JOptionPane.showMessageDialog(null, "El numero no es valido..", "Administrador CEI", 2);
                break;

        }

    }

}
