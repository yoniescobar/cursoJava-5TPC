
package programa3while;

import javax.swing.JOptionPane;

public class Programa3While {

    
    public static void main(String[] args) {
        int contadorPos=0,contadorNeg=0,numero;
        int sumaPos=0,sumaNega=0;
        
        numero=2;
                
        while(numero!=0){
         numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
          //-5
         if(numero>0){
            contadorPos++; //3 
            sumaPos +=numero;
         }else if(numero<0){
            contadorNeg++; //2 
            sumaNega +=numero;
         }
          
        }
        
        System.out.println(" Positivos: "+contadorPos+" la suma: "+sumaPos);
        System.out.println("Negativos: "+contadorNeg +" la suma: "+sumaNega);
    
        
    }
    
}
