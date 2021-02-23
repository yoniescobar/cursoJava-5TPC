package menucajero;

import javax.swing.JOptionPane;

public class MenuCajero {

    public static void main(String[] args) {
        //1. Declarando varibles
        final int saldoInicial = 1000;
        int opcion;
        float cantidad, saldoActual;

        //2. Ingreso de datos
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Binvenido a su cajero Automatico\n"
                + " Ingrese una Opcion Valida \n"
                + "1. Ingrese Dinero la Cuenta: \n"
                + "2. Retirar Dinero de la Cuenta:\n"
                + "3. Salir"));

        switch (opcion) {
            case 1:
                cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Cantidad a Depositar: "));
                saldoActual = saldoInicial + cantidad;
                JOptionPane.showMessageDialog(null, "Saldo Actual: " + saldoActual);
                break;
            case 2:
                cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Cantidad a Retirar: "));
                //800>1000
                if (cantidad > saldoInicial) {
                    JOptionPane.showMessageDialog(null, "Saldo Insuficiente");
                } else {
                    saldoActual = saldoInicial - cantidad;
                    JOptionPane.showMessageDialog(null, "Saldo Actual: " + saldoActual);
                }
                break;

            case 3:
                break;

            default:
                JOptionPane.showMessageDialog(null, "Ingrese una opcion valida..!");

        }

    }
}
