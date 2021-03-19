
package producto10impares;

public class Producto10impares {

    public static void main(String[] args) {
        long producto=1;
        
        for(int i=1;i<=20;i++){
            if(i%2!=0){
                System.out.println(i);
                producto = producto*i;
            }
        
        }
        
        System.out.println("El resulado es: "+producto);
    }
    
}
