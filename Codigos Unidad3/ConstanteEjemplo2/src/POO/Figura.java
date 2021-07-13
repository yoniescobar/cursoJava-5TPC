
package POO;

public class Figura {
    //atributos
    private final double pi = 3.1416; //constante
    private double radio;
    
    
    //Metodo constructor
    public Figura(double radio) {
        this.radio = radio;
    }
    
    public double calcularPerimetro(){
        return  2*pi*radio; //retornar datos forma corta
    }
    
    public double calcularArea(){
         double area;
         area = pi*radio*radio;  //retornar datos forma extensa
         return area;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

   
    
    
}
