
package POO;

public class Auto {
    //Atributos
    String color;
    String marca;
    int    modelo;
    double  motor;
    
    //Metodos
    void arrancar(){ //es un metodo sin parametro.
        System.out.println("Haz arrancado el Auto... ");
    }
    
    void acelerar(int km){ //es un metodo con parametro.
        System.out.println("Haz acelerado el auto... br brbrrr "+km+" km por hora");
    }
    
    void frenar(){
        System.out.println(" Haz frenado el automovil..");
    }
    
    
}
