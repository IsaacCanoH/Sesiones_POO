package mx.utng.s11.Reto01;

public class Empleado extends Persona {
    private float salario;

    public Empleado(String nombre, byte edad, LocalDate fechaNacimiento, float salario) {
        super(nombre, edad, fechaNacimiento);
        this.salario = salario;
    }

    private float getSalario() {
        return salario;
    }

    public static void main(String[] args) {
        // Crear una instancia de Empleado
        Empleado empleado = new Empleado("Juan", (byte) 30,
                LocalDate.of(1994, 5, 15), 60000.0f);

        // Mostrar información en la terminal
        System.out.println("Nombre: " + empleado.getNombre());
        System.out.println("Edad: " + empleado.getEdad());
        System.out.println("Salario: $" + empleado.getSalario());
    }
}
