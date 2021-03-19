
package ciclowhileacumulativo;

import javax.swing.JOptionPane;

public class CicloWhileAcumulativo {

    public static void main(String[] args) {
        //Declarar varibles
        float suma=0,promedio=0;
        int numero,contador=0;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
       
        while(numero>=0){
            if(numero>=0){
            suma +=numero;  //suma = suma + numero
            contador++;
            }
          numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro  numero: "));
        }
        
        promedio = (float) suma/contador; //  0/0 ** division no definida
        
        System.out.println("Suma: "+suma);
        System.out.println("Promedio: "+promedio);
        
        
    }
    
}
