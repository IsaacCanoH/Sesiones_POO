package mx.utng.s11.Reto01;

import java.time.LocalDate;

public class DBA extends Empleado {
    private String herramientaConsultas;

    public DBA(String nombre, byte edad, LocalDate fechaNacimiento,
                float salario, String herramientaConsultas) {
        super(nombre, edad, fechaNacimiento, salario);
        this.herramientaConsultas = herramientaConsultas;
    }

    public String getHerramientaConsultas() {
        return herramientaConsultas;
    }

    public static void main(String[] args) {
        // Crear una instancia de DBA
        DBA dba = new DBA("María", (byte) 28,
                LocalDate.of(1996, 8, 20), 55000.0f, "SQL Server");

        // Mostrar información en la terminal
        System.out.println("Nombre: " + dba.getNombre());
        System.out.println("Edad: " + dba.getEdad());
        System.out.println("Salario: $" + dba.getSalario());
        System.out.println("Herramienta de Consultas: " + dba.getHerramientaConsultas());
    }
}

