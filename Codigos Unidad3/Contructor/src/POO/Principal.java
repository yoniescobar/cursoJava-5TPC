
package POO;

public class Principal {
    public static void main(String[] args) {
        Alumnos A1 = new Alumnos(35,"Yosua Eduardo","Escobar Zapata");
        Alumnos A2 = new Alumnos(36,"Jessica Alicia"," Giron Gutierrez");
        A1.verDatos();
        System.out.println("\n Datos del Alumno 2 ----");
        A2.verDatos();
     
    }
}
