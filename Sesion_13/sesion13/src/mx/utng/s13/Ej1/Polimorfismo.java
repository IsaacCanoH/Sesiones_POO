package mx.utng.s13.Ej1;

public class Polimorfismo {
    public static void main(String[] args) {
        Profesor profe1 = new Profesor("Laura", "Hernandez Hernandez", "UTNG00541");
        profe1.mostrarDatos();
        Profesor profe2 = new ProfesorInterino("Andres", "Hernandez Perez", "UTNG00652");
        profe2.mostrarDatos();
    }
}
