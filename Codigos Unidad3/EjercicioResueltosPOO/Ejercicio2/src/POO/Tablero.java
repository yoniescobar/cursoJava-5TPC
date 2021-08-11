
package POO;

public class Tablero {
    //Atriburos
    private int x;
    private int y;
    
    //contructor

    public Tablero(int x, int y) {
        this.x = x;
        this.y = y;
        //x = 0
        //y = 0
    }
    
    //creacion de los metodos que van operar //y=3
    public void moverArriba(int incremento){
        y= y+incremento;
       
    }
    public void moverAbajo(int incremento){
        y= y-incremento;
       
    }
     public void moverDerecha(int incremento){
        x= x+incremento;
       
    }
    public void moverIzquierda(int incremento){
        x= x-incremento;
       
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
       
    
    
}
