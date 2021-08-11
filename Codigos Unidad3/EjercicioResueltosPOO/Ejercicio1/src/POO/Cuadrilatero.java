
package POO;

public class Cuadrilatero {
    //Atributos
    private float lado1;
    private float lado2;
    
    //contructor
    //Método Constructor 1 **rectangulo (cuadrilatero)
    public Cuadrilatero(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    //Método Constructor 2 **cudrado(cuadrilatero)

    public Cuadrilatero(float lado1) {
        this.lado1 = this.lado2 = lado1; //El lado 1 es igual a lado 2
    }
    
    public float obtenerPerimetro(){
        float perimetro = 2*(lado1+ lado2);    //2*lado1 + 2*lado2
        return perimetro;
    }
    
    public float obtenerArea(){
        float area = (lado1 * lado2);    
        return area;
    }
    
}
