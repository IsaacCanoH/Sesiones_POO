package mx.utng.r13;
/*
 * @name: Isaac Cano Hernandez
 * @date: 08-02-24
 * @group: GDS0624
 */

import java.util.ArrayList;
import java.util.List;

public class Frutas {
    public static void main(String[] args) {
        List<String> listaFrutas = new ArrayList<>();
        listaFrutas.add("Platanos");
        listaFrutas.add("Sandia");
        listaFrutas.add("Pera");
        listaFrutas.add("Manzana");
        listaFrutas.add("Naranja");
        listaFrutas.add("Kiwi");

        System.out.println("Lista de frutas:");
        for (String fruta : listaFrutas) {
            System.out.println(fruta);
        }
    }
}
