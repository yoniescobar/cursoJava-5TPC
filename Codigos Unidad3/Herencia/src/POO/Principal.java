
package POO;


public class Principal {
    
    public static void main(String[] args) {
      Estudiante E1 = new Estudiante(145, 80, "Jose Antonio", "Morales López", 15);
      Profesor P1 = new Profesor(25, 3500, "Matemática", "Jose Rabanales", "Cifuentes", 45);
      
      E1.mostrarDatos();
        System.out.println("\n\n Datos del Profesor: ");
      P1.mostrarDatos();
    }
}
