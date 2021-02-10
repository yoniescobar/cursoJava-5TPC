/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgwhile;

import java.util.Scanner;

/**
 *
 * @author YONI
 */
public class While {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int numero=0,suma=0;
        
        while(numero!=0){
            System.out.println("Ingrese un numero: ");
            numero = entrada.nextInt();
            suma = suma+numero;
            System.out.println("La suma es: "+suma);
        }
        
        
        
        
    }
    
}
