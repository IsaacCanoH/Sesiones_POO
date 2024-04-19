package mx.utng.r13;
/*
 * @name: Isaac Cano Hernandez
 * @date: 08-02-24
 * @group: GDS0624
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Colecciones {
    public static void main(String[] args) {
        List<String> listaFrutas = new ArrayList<>();
        listaFrutas.add("Platanos");
        listaFrutas.add("Sandia");
        listaFrutas.add("Pera");
        listaFrutas.add("Manzana");
        listaFrutas.add("Naranja");
        listaFrutas.add("Kiwi");

        Collections.sort(listaFrutas);
        System.out.println("-----------ListaOrdenada-----------------");
        System.out.println("Lista de frutas ordenada alfabéticamente:");
        for (String fruta : listaFrutas) {
            System.out.println(fruta);
        }

        System.out.println("--------------Posiciones----------------");
        int posicionPera = listaFrutas.indexOf("Pera");
        int posicionManzana = listaFrutas.indexOf("Manzana");
        System.out.println("\nPosición de 'Pera': " + posicionPera);
        System.out.println("Posición de 'Manzana': " + posicionManzana);

        for (int i = 0; i < 3; i++) {
            listaFrutas.add("Manzana");
        }

        System.out.println("-----------------ListaAleatoria----------------");
        List<String> listaFrutasAleatorias = new ArrayList<>(listaFrutas);
        Collections.shuffle(listaFrutasAleatorias);

        System.out.println("\nLista de frutas ordenadas aleatoriamente:");
        for (String fruta : listaFrutasAleatorias) {
            System.out.println(fruta);
        }

        System.out.println("-----------------Manzanas------------------");
        int conteoManzana = Collections.frequency(listaFrutas, "Manzana");
        System.out.println("\nCantidad de 'Manzana' en la lista: " + conteoManzana);
    }
}

