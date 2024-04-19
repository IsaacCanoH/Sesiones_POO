package mx.utng.s14;

public class Libro implements Comparable<Libro>{
    private final String TITULO;
    private int prioridad;

    public Libro(String titulo, int prioridad) {
        this.TITULO = titulo;
        this.prioridad = prioridad;
    }

    public String getTITULO() {
        return TITULO;
    }

    @Override
    public int compareTo(Libro libro) {
        return this.prioridad = libro.prioridad;
    }

    @Override
    public String toString() {
        return "Libro [TITULO=" + TITULO + "]";
    }
}
