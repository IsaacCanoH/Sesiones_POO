package mx.utng.s11.Reto01;

import java.time.LocalDate;

public class Persona {
    private String nombre;
    private byte edad;
    private final LocalDate fechaNacimiento;

    public Persona(String nombre, byte edad, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
    }

    private String getNombre() {
        return nombre;
    }

    private byte getEdad() {
        return edad;
    }

    private LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public static void main(String[] args) {
        // Crear una instancia de Persona
        Persona persona = new Persona("Isaac", (byte) 22,
                LocalDate.of(2005, 4, 29));

        // Mostrar información en la terminal
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Fecha de Nacimiento: " + persona.getFechaNacimiento());
    }
}
