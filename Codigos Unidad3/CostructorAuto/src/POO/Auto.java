
package POO;

public class Auto {
    //Atributos
    String marca;
    int modelo;
    String color;
    double motor;
    
    //metodos
    //1. Metodo de Constructor
       public Auto(String marca, int modelo, String color, double motor){
           this.marca=marca;
           this.modelo=modelo;
           this.color =color;
           this.motor=motor;
       }
       
      public void verDatos(){
           System.out.println("Marca: "+marca);
           System.out.println("Modelo: "+modelo);
           System.out.println("Color: "+color);
           System.out.println("Motor: "+motor);
       }
    
    
}
