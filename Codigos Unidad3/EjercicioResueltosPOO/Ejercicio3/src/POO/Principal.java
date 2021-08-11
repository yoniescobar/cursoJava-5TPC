
package POO;

import java.util.Scanner;

public class Principal {
    public static int indiceAutoMBarato(Vehiculo autos[] ){
        float precioMenor;
        int indice = 0;
        
        precioMenor = autos[0].getPrecio(); //el precio de la posicion 0---65000
        
        for(int i=1;i<autos.length;i++){
             if(autos[i].getPrecio()<precioMenor){ // 100 000<35 000
                 precioMenor = autos[i].getPrecio(); //35 000
                 indice = i; // posicion 3
             }
        }
        return indice;     // System.out.println(autos[indice]);
    }
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String marca,modelo,color;
        float precio;
        int numeroVehiculos; // variable que indica de cuanto va hacer mi vector
        int indiceMBarto;
        
        System.out.print("Digite la Cantidad de Vehiculos a Ingresar: ");
        numeroVehiculos = entrada.nextInt();
        
        //creamos los objetos para los autos
        Vehiculo autos[] = new Vehiculo[numeroVehiculos];
        
        for(int i=0;i<numeroVehiculos;i++){
            System.out.println("\n Ingrese las caracteristicad el Auto No. "+(i+1)+":");
            System.out.print("Ingrese la Marca: ");
            marca = entrada.nextLine();
            entrada.nextLine(); //limpiar buffer
            System.out.print("Ingrese el Modelo: ");
            modelo = entrada.nextLine();
            System.out.print("Ingrese el Color: ");
            color = entrada.nextLine();
            System.out.print("Ingrese el Precio: ");
            precio = entrada.nextFloat();
            autos[i] = new Vehiculo(marca, modelo, color, precio);
        }
          indiceMBarto = indiceAutoMBarato(autos);
          
          System.out.println("\n El Auto mas barato es: ");
          System.out.println(autos[indiceMBarto].mostrarDato());
        
    }
}
