
package archivotexto2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ArchivoTexto2 {
    File archivo; //File crea un variable para trabajar con archivos
    
    private void crearArchivo(){ //metodo para crear un archivo
       archivo = new File("archivoTexto.txt");
       
        try {
            if(archivo.createNewFile()){ //crear un nuevo archivo y retorna true si crea el archivo
                System.out.println("El archivo se ha creado Satifactoriamente!!");
            }
        
        } catch (IOException ex) {
            System.err.println("No se pudo crear el archivo: "+ex);
        }
       
    }
    private void escribirEnArchivo(){
        String nombre;
        int edad=0;
        try {
            FileWriter escribir = new FileWriter(archivo);
            
            nombre = JOptionPane.showInputDialog(null, "Ingrese Nombre: ");
            edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su Edad:"));
             //Aqui la variable nombre envia lo que capture el JOptionPane.
            escribir.write(nombre); //envio la cadena al archivo
            escribir.write("\r\n "+edad);
            escribir.close(); //cierra el archivo
        } catch (IOException z) {
            System.err.println("Error, no se pudo escribir sobre el archivo "+z);
        }
        
    }
    private void añadirTexto(){
          String nombre;
        int edad=0;
        try {
            FileWriter escribir = new FileWriter(archivo,true);
            
            nombre = JOptionPane.showInputDialog(null, "Ingrese  Nombre: ");
            edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese  Edad:"));
             //Aqui la variable nombre envia lo que capture el JOptionPane.
            escribir.write(nombre); //envio la cadena al archivo
            escribir.write("\t "+edad +"\n");
 
            escribir.close(); //cierra el archivo
        } catch (IOException z) {
            System.err.println("Error, no se pudo escribir sobre el archivo "+z);
        }
         
         
    }
    private void leerTexto(){
        String cadena;
        try {
            FileReader lector = new FileReader(archivo);
            BufferedReader lectura  = new BufferedReader(lector);
            cadena = lectura.readLine();
           // System.out.println(cadena);
           while(cadena!=null){
               System.out.println(cadena);
               cadena = lectura.readLine();
           }
            
           
        } catch (FileNotFoundException excepcion) {
            System.err.println("Error "+excepcion);
        } catch(IOException ex){
            System.err.println("Error"+ex);
        }
       
    }
    
    
    private void crearDirectorio(){ //metodo para crear un directorio
       archivo = new File("carpetaPrueba");  //nombre de la carpeta
       
       if(archivo.mkdir()){ // True si se crea la carpeta. mkdir es para hacer una carpeta         
           System.out.println("Se ha creado el directorio Correctamente");
       }else{
           System.err.println("Error, no se ha podido Crear el Directorio!!");
       }
    }
  
    public static void main(String[] args) {
       int opcion=3;
       Scanner entrada =new Scanner(System.in);
        ArchivoTexto2 archivos = new ArchivoTexto2(); // Creando el objeto
       
       archivos.crearArchivo(); //el objeto llama a su metodo crear archivo
   
         //archivos.añadirTexto();
        // archivos.escribirEnArchivo(); //el objeto llama su metodo escribirEnArchivo
      // archivos.crearDirectorio(); //el objeto llama a su metodo crearDirectorio
      //  archivos.leerTexto();
        
        do{
            
            System.out.println("----M E N U   P R I N C I P A L--");
            System.out.println("1. Ingresar Datos ");
            System.out.println("2. Mostrar Datos");
            System.out.println("3. Salir");
            System.out.println("\n Ingrese una Opcion Valida: ");
            opcion = entrada.nextInt();
            
            switch(opcion){
                case 1: 
                        
                        archivos.añadirTexto(); 
                        break;
                case 2: 
                        
                        archivos.leerTexto(); break;
                        
                case 3: 
                        
                    
                         System.out.println("Hazta pronto....");
                default: System.out.println("La opción No es Valida...");
            }
            
            
            
        }while(opcion!=3);
        
        
        
        
    }
    
}
