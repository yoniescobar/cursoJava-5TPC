
package POO;

public class Alumno {
    //Atributos
    private int edad;
    private int noControl;
    private String email;
    public String nombre,apellidos;
    
    
    //Creando los metodos get y se para poder acceder
    //a nuestros atributos privados

    
    public int getNoControl() {
        return noControl;
    }

    public void setNoControl(int noControl) {
        this.noControl = noControl;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    //Creando el metodo para mostrar los datos
    void verDatos(){
        System.out.println("No. Control: "+noControl);
        System.out.println("Edad: "+edad+" años ");
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellidos: "+apellidos);
        System.out.println("Correo: "+email);
    }
}
