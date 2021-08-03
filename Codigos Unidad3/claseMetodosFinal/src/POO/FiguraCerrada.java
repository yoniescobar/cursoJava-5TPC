
package POO;

 final public class FiguraCerrada extends Figura { // la palabra final en la clase significa que ya no puede tener mas hijos
    private int nLados;

    public FiguraCerrada(int nLados, double tamaño) {
        super(tamaño);
        this.nLados = nLados;
    }
    
   public void dibujar(){ //la palabar final en un metodos siginfica que ya no puedo utilizar ese 
                          //nombre de metodo en las de mas clasese heredadas.
       System.out.println("Dibujo de una figura Cerrada...!");
   } 
    
}
