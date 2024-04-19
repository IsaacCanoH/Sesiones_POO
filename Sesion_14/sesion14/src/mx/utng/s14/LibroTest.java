package mx.utng.s14;

import java.util.PriorityQueue;
import java.util.Queue;

public class LibroTest {
    public static void main(String[] args) {
        Queue<Libro> libro = new PriorityQueue<>();
        for (int i = 0; i < 10; i++) {
            libro.add(new Libro("Libro 1" + (i + 1), (int) (Math.random() * 10)));
        }

        System.out.println(libro);

        Libro libroActual = null;
        while ((libroActual = libro.poll()) != null) {
            System.out.println(libroActual.getTITULO());
        }
    }
}
