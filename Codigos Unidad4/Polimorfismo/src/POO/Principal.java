
package POO;

public class Principal {
    
    public static void main(String[] args) {
      Vehiculo misVehiculos[] = new Vehiculo[4];  //mi vector inicia 0 - 3
      
      misVehiculos[0] = new Vehiculo("NXY123","VolsBagen","2013");
      misVehiculos[1] = new VehiculoTurismo(4,"MER124","TOYOTA","2010");
      misVehiculos[2] = new VehiculoDeportivo(500,"ZTW156","FERRARY","2020");
      misVehiculos[3] = new VehiculoFurgoneta(2000,"YRH789","MITHUBISHI","2000");
      
      //for ech
      for(Vehiculo vehiculos: misVehiculos){
          System.out.println( vehiculos.mostrarDatos());
          System.out.println("\n\n");
      }
      
    }
}
