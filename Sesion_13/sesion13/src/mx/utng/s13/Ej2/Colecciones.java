package mx.utng.s13.Ej2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Colecciones {
    public static void main(String[] args) {
        List<String> listaCadenas = new ArrayList<>();
        listaCadenas.add("uno");
        listaCadenas.add("dos");
        listaCadenas.add("tres");
        listaCadenas.add("cuatro");
        listaCadenas.add("cinco");

        System.out.println(listaCadenas);
        for (String cadena : listaCadenas) {
            System.out.println(cadena);
        }

        System.out.println("=======foreach=========");
        for (String cadena : listaCadenas) {
            System.out.println(cadena);
        }

        // Conjunto de cadenas
        Set<String> setCadenas = new HashSet<>();
        setCadenas.add("uno");
        setCadenas.add("dos");
        setCadenas.add("tres");
        setCadenas.add("cuatro");
        setCadenas.add("cinco");

        // Foreach para imprimir valores
        System.out.println("=======SET de Cadenas=========");
        for (String cadena : setCadenas) {
            System.out.println(cadena);
        }

        List<Numero> listaNumeros = new ArrayList<>();
        listaNumeros.add(new Numero("uno"));
        listaNumeros.add(new Numero("dos"));
        listaNumeros.add(new Numero("dos"));
        listaNumeros.add(new Numero("tres"));
        listaNumeros.add(new Numero("cuatro"));
        listaNumeros.add(new Numero("Cinco"));

        for (Numero numero : listaNumeros) {
            System.out.println(numero);
        }
    }
}
