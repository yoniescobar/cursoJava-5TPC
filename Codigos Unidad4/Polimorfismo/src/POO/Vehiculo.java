
package POO;
//clase Padre.
public class Vehiculo {
    //atributos
    protected String matricula;
    protected String marca;
    protected String modelo;
    
    //contructuctor

    public Vehiculo(String matricula, String marca, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }

     //metodo de accesores   get---> obtener el dato.
    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
    
    public String mostrarDatos(){
        return "Matricula: "+matricula+"\n Marca: "+marca+"\n Modelo: "+modelo;
              
    }
    
    
}
