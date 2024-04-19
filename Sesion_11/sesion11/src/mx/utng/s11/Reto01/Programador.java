package mx.utng.s11.Reto01;

public class Programador extends Empleado {
    private String lenguajePrincipal;

    public Programador(String nombre, byte edad,
                       LocalDate fechaNacimiento,
                       float salario,
                       String lenguajePrincipal) {

        super(nombre, edad, fechaNacimiento, salario);
        this.lenguajePrincipal = lenguajePrincipal;
    }

    private String getLenguajePrincipal() {
        return lenguajePrincipal;
    }

    public static void main(String[] args) {
        // Crear una instancia de Programador
        Programador programador = new Programador("Ana", (byte) 25,
                LocalDate.of(1999, 3, 10), 70000.0f, "Python");

        // Mostrar información en la terminal
        System.out.println("Nombre: " + programador.getNombre());
        System.out.println("Edad: " + programador.getEdad());
        System.out.println("Salario: $" + programador.getSalario());
        System.out.println("Lenguaje Principal: " + programador.getLenguajePrincipal());
    }
}
