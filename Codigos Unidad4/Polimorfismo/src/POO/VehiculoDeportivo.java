
package POO;

public class VehiculoDeportivo extends Vehiculo {
    //atributo Particular de la clase hija.
    private int cilindrada;
    
     //contructor.
    public VehiculoDeportivo(int cilindrada, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.cilindrada = cilindrada;
    }
    
    //obtener la cilindrada

    public int getCilindrada() {
        return cilindrada;
    }
    
     @Override //sobre Escribir 
     public String mostrarDatos(){
        return "Matricula: "+matricula+"\n Marca: "+marca+"\n Modelo: "+modelo+
                "\n Cilindrada"+cilindrada;
              
    }
    
    
}
