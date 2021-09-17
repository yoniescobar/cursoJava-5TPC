
package POO;

public class VehiculoFurgoneta extends Vehiculo {
    //atributo Particular de la clase hija.
    private int carga;
    
    //constructor

    public VehiculoFurgoneta(int carga, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.carga = carga;
    }
    
    //obtener el numero carga

    public int getCarga() {
        return carga;
    }
    @Override //sobre Escribir 
     public String mostrarDatos(){
        return "Matricula: "+matricula+"\n Marca: "+marca+"\n Modelo: "+modelo+
                "\n Carga: "+carga;
              
    }
    
    
}
