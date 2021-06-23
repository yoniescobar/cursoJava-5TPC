
package POO;

public class Principal {
    public static void main(String[] args) {
        Operaciones op1 = new Operaciones();
        
       
      
    
        int mayor = op1.calcularMayor(8, 9, 10); //variables
    
        
        System.out.println("La suma es: "+op1.sumar(5, 8));
        System.out.println("La resta es: "+op1.restar(8, 5));
        System.out.println(op1.saludar("Yoni Edilzar"));
        
        System.out.println("El mayor de los 3 numeros es: "+mayor);
        System.out.println("El Menor de los 3 numeros es: "+op1.calcularMenor(8, 9,10));
    }
    
}
