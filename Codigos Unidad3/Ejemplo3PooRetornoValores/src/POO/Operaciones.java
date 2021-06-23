
package POO;

public class Operaciones {
    
    //atributos
    
    //metodos
    public int sumar(int num1, int num2){
      int suma = num1+num2;
       return suma;
    }
    
    public int restar(int num1, int num2){
      int resta = num1-num2;
       return resta;
    }
    
    public String saludar(String nombre){
      String saludo = "Saludo desde la clase operaciones: "+nombre;
      
      return  saludo; 
    }
    
    public int calcularMayor(int n1, int n2, int n3){
        int mayor;
        
        if(n1>n2 && n1>n3 ){
            mayor = n1;
        }else if(n2>n1 && n2>n3){
            mayor = n2;
        }else{
            mayor = n3;
        }
        
        return mayor;
    }
    
    
     public int calcularMenor(int n1, int n2, int n3){
        int menor;
        
        if(n1<n2 && n1<n3 ){
            menor = n1;
        }else if(n2<n1 && n2<n3){
            menor = n2;
        }else{
            menor= n3;
        }
        
        return menor;
    }
    
}
