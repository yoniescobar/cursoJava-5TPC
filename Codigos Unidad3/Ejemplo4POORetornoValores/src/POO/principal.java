
package POO;

public class principal {
   
    public static void main(String[] args) {
        operaciones op1 =new operaciones();
        
        double radio = op1.calcularAreaCirculo(10);
        
        boolean estado=op1.estado(85);
        
        if(estado==true){
            System.out.println("Que mal, estás Borracho");
        }else{
             System.out.println("Que Bien, estás Sobrio");
        }
        
        System.out.println("El area Circulo es: "+radio+" metros cuadrados");
        
        
        
        
        
    }
}
