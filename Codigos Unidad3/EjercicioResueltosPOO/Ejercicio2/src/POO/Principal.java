
package POO;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Tablero t1;   //Tablero t1 = new Tablero(x, y);
        int x,y,opcion,incremento=0;
        
        System.out.print("Digite la coordenada inicial de x: ");
        x = entrada.nextInt();
        System.out.print("Digite la coordenada inicial de y: ");
        y = entrada.nextInt();
        
        //posicion inicial del objeto
        t1 = new Tablero(x, y);
        
        do{
            System.out.println("\n\t .:. M E N U .:.");
            System.out.println("1. Mover hacia ARRIBA");
            System.out.println("2. Mover hacaia ABAJO");
            System.out.println("3. Mover hacia la DERECHA");
            System.out.println("4. Mover hacia la IZQUIERDA");
            System.out.println("5. Salir");
            System.out.print("Ingrese una Opcion valida: ");
            opcion = entrada.nextInt();
        
             if(opcion !=5){
                 System.out.print("\n Digite la cantidad de espacion a moverse: ");
                 incremento = entrada.nextInt(); //5
             }
            
            switch(opcion){
                case 1: t1.moverArriba(incremento); break;
                case 2: t1.moverAbajo(incremento); break;
                case 3: t1.moverDerecha(incremento); break;
                case 4: t1.moverIzquierda(incremento); break;
                case 5: break;
                default: System.out.println("Error, ingrese opcion valida del menu...!");
            }
            System.out.println("\n Posicion Actual (x,y): ("+t1.getX()+","+t1.getY()+")"); //(-5,0) 
        }while(opcion!=5);
        
        
    }
}
