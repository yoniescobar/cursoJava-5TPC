
package archivotexto;

import java.io.File;
import javax.swing.JOptionPane;




public class ArchivoTexto {

    public static void main(String[] args) {
     
        File archivo = new File("agenda.txt"); // ruta del archivo
        
        if(archivo.exists()){ //si el archivo existe
            
                    System.out.println("El archivo si existe!!!");
                    System.out.println("Ruta Absoluta "+archivo.getAbsolutePath());
                    System.out.println("¿Es un archivo? "+archivo.isFile());
                    System.out.println("¿Se puede Leer?"+archivo.canRead());
        }else{
              System.out.println("El archivo No existe!!!");
        }
        
    }  
}
