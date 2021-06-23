
package POO;

public class operaciones {
    
  public double calcularAreaCirculo(int radio){
      double area=3.1416 * radio * radio;
      return area;
  } 
  
  public boolean estado (int tequilas ){
      boolean e=false;
      if(tequilas>=5){
          e = true;
      }else{
          e = false;
      }
      return e;
  }
}
