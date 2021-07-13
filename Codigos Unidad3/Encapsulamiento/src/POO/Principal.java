
package POO;

public class Principal {
    public static void main(String[] args) {
        Alumno A1 = new Alumno();
        A1.setNoControl(18545);
        A1.setEdad(18);
        System.out.println("La edada Nueva es: "+A1.getEdad());
        A1.nombre ="Jose Antonio Javier ";
        A1.nombre = "Jose Antonio Alonzo";
        A1.setEdad(28);
        System.out.println("La edada Nueva es: "+A1.getEdad());
        A1.apellidos ="Morales López ";
        A1.setEmail("joseantonio2021@gmail.com");
        A1.verDatos(); //esto es para mostrar datos.
        
        A1.setNoControl(18546);
        System.out.println("Nuvo numero de control: "+A1.getNoControl());
        
    }
}
