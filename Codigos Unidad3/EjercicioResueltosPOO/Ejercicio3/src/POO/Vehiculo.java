
package POO;

public class Vehiculo {
    //atributos
    private String marca;
    private String modelo;
    private String color;
    private float precio;
    
    //contructor

    public Vehiculo(String marca, String modelo, String color, float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
    }
    
    public float getPrecio(){
        return precio;
    }
    
    //metodo para mostrar datos
    public String mostrarDato(){
        return "Marca: "+marca+"\n Modelo: "+modelo+"\nColor: "+color+"\n Prcion Q. "+precio+"\n";
    }
   
}
