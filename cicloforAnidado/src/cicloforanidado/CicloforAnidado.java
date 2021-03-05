
package cicloforanidado;

public class CicloforAnidado {

    public static void main(String[] args) {
        
        for(int i=1;i<=5;i++){ //for Externo
            System.out.println(i); 
            for(int j=1;j<=3;j++ ){ //for Interno
                System.out.println("\t"+j);
            }
            
        }
        
        
        
        
    }   
}
