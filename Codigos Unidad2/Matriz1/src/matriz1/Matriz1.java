
package matriz1;

public class Matriz1 {

    public static void main(String[] args) {
       int matriz[][] = {{1,2,3},
                         {4,5,6},
                         {7,8,9},
                         {10,11,12}
                         };
       
        //System.out.println("M[2][3]="+matriz[2][3]); Mostrar un elemento
        
        for(int i=0;i<4;i++){ //recorre las filas
            for(int j=0;j<3;j++){ //recorre las columna
                System.out.print(matriz[i][j] + "\t ");
            }
            System.out.println("");
        }
       
       
    }
    
}
