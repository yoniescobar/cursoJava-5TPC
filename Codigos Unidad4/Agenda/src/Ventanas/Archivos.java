
package Ventanas;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

//crear el la variable File para trabajar con todos los componentes de Archivos
public class Archivos {
    private File archivo;
    
    //Crear el metodo CrearArchivo 
    public void crearArchivo(){
        //direccion relativa se encuentra en la carpeta del Proyecto 
        archivo = new File("agendaContactos.txt"); 
        
        try {
            if(archivo.createNewFile()){
                //Archivo creado
            }
        } catch (IOException ex) {
            System.err.println(" Error... "+ex);
        }
        
    }
    public void escribirTexto(Persona persona){
        try {
            FileWriter escribir = new FileWriter(archivo,true);
            escribir.write(persona.getNombre()+ ","+persona.getCorreo()+","+persona.getCelular()+"\r\n");
            escribir.close();
        } catch (IOException ex) {
            System.err.println("Error... "+ex);
        }
    }
}
