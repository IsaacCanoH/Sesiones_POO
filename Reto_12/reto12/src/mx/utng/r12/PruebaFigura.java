package mx.utng.r12;

/**
 * @author: Isaac Cano Hernandez
 * @date: 06/02/2024
 * @group: GDS0624
 */


public class PruebaFigura {
    public static void main(String[] args) {
        Figura figura;

        figura = new Triangulo();
        figura.formulaCalculaArea();

        figura = new Rectangulo();
        figura.formulaCalculaArea();

        figura = new Cuadrado();
        figura.formulaCalculaArea();
    }
}
