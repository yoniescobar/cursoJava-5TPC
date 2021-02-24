
package programa2while;

import javax.swing.JOptionPane;

public class Programa2While {

    public static void main(String[] args) {
       /*  Hacer un programa que ingrese numeros positivos y al ingresar un 
        negativo muestre cuantos numeros ingresamos*/
       
       int numero, contador=0;
       
         numero =Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
       
       while(numero>=0){
             contador++; ///contador = contador+1; 
             numero =Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero: "));

       }
       
        System.out.println("ha ingresado"+contador+ " numeros positivo");
       
    }
    
}
