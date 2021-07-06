
package POO;

public class Principal {
    public static void main(String[] args) {
        Auto A1 = new Auto("Toyota", 2010, "Rojo", 2.4);
        Auto A2 = new Auto("Audi", 2021, "Vino Tinto", 3.4);
        A1.verDatos();
        System.out.println("\n Auto No. 2");
        A2.verDatos();
        
    }
}
