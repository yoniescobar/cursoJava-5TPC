package calculadoraaritmetica;

import javax.swing.JOptionPane;

public class CalculadoraAritmetica {

    public static void main(String[] args) {
        int numero1, numero2, suma, resta, mult, div;
        char opcion;   // += suma  -=resta *=multiplicacion  /= division

        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor 1: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor 2: "));

        opcion = JOptionPane.showInputDialog("Ingrese la Operacion a realizar").charAt(0);

        switch (opcion) {
            case 's':
            case 'S':
            case '+':   
                suma = numero1 + numero2;
                JOptionPane.showMessageDialog(null, "La suma es: " + suma);
                break;
            case 'r':
            case 'R':
            case '-':
                resta = numero1 - numero2;
                JOptionPane.showMessageDialog(null, "La resta es: " + resta);
                break;
            case 'm':
            case 'M':
            case '*':
                mult = numero1 * numero2;
                JOptionPane.showMessageDialog(null, "La Multiplicacion es: " + mult);
                break;
            case 'd':
            case 'D':
            case '/':
                div = numero1 / numero2;
                JOptionPane.showMessageDialog(null, "La Division es: " + div);
                break;
            default:
                JOptionPane.showMessageDialog(null, "a Ingresado una letra invalido...!", "Administrador CEI", 3);
                break;
        }

    }

}
