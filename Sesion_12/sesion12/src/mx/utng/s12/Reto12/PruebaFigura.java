package mx.utng.s12.Reto12;

public class PruebaFigura {
    public static void main(String[] args) {
        Figura figura;

        
        figura = new triangulo();
        figura.formulaCalculaArea();

      
        figura = new rectangulo();
        figura.formulaCalculaArea();

        
        figura = new cuadrado();
        figura.formulaCalculaArea();
    }
}
