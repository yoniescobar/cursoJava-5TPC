
package repasoforeach;


public class RepasoForEach {

    public static void main(String[] args) {
       String[] vecNombre = {"Brayan","José","Kevin","Elmer","Dulce","Brayan","José","Kevin","Elmer","Dulce"};
       
      /* for(int i=0;i<vecNombre.length;i++){
           System.out.println(vecNombre[i]);
       }*/
      
         for(String elemento: vecNombre ){ //tipoDato, variable, nombreVector---> (for Each) 
             System.out.println("Nombre del alumno: "+ elemento);
         }
       
    }
    
}
