
package POO;

public class VehiculoTurismo extends Vehiculo {
    //atributo Particular de la clase hija.
    private int nPuertas;
    
    //contructor.

    public VehiculoTurismo(int nPuertas, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.nPuertas = nPuertas;
    }
    
    //metodo para obtener numero puertas

    public int getnPuertas() {
        return nPuertas;
    }
    
    
     @Override //sobre Escribir 
     public String mostrarDatos(){
        return "Matricula: "+matricula+"\n Marca: "+marca+"\n Modelo: "+modelo+
                "\n Numero de Puertas"+nPuertas;
              
    }
    
    
}
