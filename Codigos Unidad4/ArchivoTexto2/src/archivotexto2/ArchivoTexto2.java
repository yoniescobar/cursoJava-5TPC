
package archivotexto2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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
        String texto="";
        try {
            FileWriter escribir = new FileWriter(archivo);
            
            escribir.write(texto); //envio la cadena al archivo
            escribir.write("\r\nClase de Quinto Perito Contador A B y C");
            escribir.close(); //cierra el archivo
        } catch (IOException z) {
            System.err.println("Error, no se pudo escribir sobre el archivo "+z);
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
       ArchivoTexto2 archivos = new ArchivoTexto2(); // Creando el objeto
       
       archivos.crearArchivo(); //el objeto llama a su metodo crear archivo
       archivos.escribirEnArchivo(); //el objeto llama su metodo escribirEnArchivo
      // archivos.crearDirectorio(); //el objeto llama a su metodo crearDirectorio
    
    }
    
}
