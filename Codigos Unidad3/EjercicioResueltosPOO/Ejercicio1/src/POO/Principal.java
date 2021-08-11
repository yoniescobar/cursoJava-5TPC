
package POO;

import javax.swing.JOptionPane;

public class Principal {
    
    public static void main(String[] args) {
        Cuadrilatero c2 = new Cuadrilatero(0);
        Cuadrilatero c1; 
        float lado1,lado2;
        
        lado1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el Lado 1"));
        lado2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el Lado 2"));
       
       if(lado1==lado2){ //aqui valido si es un cuadrado
           c1 =  new Cuadrilatero(lado1); //lado1
       }else{
           c1 =  new Cuadrilatero(lado1,lado2); // cosa contraria enviar ambos lados
       }
        
        System.out.println("El Perimetro es: "+c1.obtenerPerimetro());
        System.out.println("El Area es: "+c1.obtenerArea());
        
        
        
    }
}
