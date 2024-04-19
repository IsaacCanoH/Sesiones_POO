package mx.utng.r11;

import java.time.LocalDate;

public class Persona_Isaac {
    private String nombre;
    private byte edad;
    private final LocalDate fechaNacimiento;

    public Persona_Isaac(String nombre, byte edad, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public byte getEdad() {
        return edad;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
}
