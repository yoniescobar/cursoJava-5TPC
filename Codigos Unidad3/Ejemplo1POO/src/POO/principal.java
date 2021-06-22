
package POO;

public class principal {
      
    public static void main(String[] args) {
        Auto A1 = new Auto(); //Creando el objeto.
        Auto A2 = new Auto();
        
        //Datos del Auto 1
        A1.color = "Rojo";
        A1.marca = "Toyota";
        A1.modelo = 2010;
        A1.motor =  2.4;
        
        System.out.println("\n ------ Auto 1----------");
        System.out.println("Color "+A1.color);
        System.out.println("Marca "+A1.marca);
        System.out.println("Modelo "+A1.modelo);
        System.out.println("Motor "+A1.motor);
        A1.arrancar();
        
          //Datos del Auto 2
        A2.color = "Azul";
        A2.marca = "Chevrolet";
        A2.modelo = 2021;
        A2.motor =  1.8;
        
        System.out.println("\n ------ Auto 2----------");
        System.out.println("Color "+A2.color);
        System.out.println("Marca "+A2.marca);
        System.out.println("Modelo "+A2.modelo);
        System.out.println("Motor "+A2.motor);
        A2.arrancar();
        A2.acelerar(80); //envio se llama argumento
        A2.frenar();
        
        
    }
}
