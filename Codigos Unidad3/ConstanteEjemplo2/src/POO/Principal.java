
package POO;

public class Principal {
    public static void main(String[] args) {
        Figura f1 = new Figura(15);
        Figura f2 = new Figura(3);
        
        f1.setRadio(8);
        
        System.out.println("El area del circulo con radio "+f1.getRadio()+" es: "+f1.calcularArea());
        System.out.println("El Perimetro del Circulo con radio"+f2.getRadio()+" es: "+f2.calcularPerimetro());
    }
}

//El area del circulo con radio 9 es: 254.34
