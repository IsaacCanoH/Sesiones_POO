package mx.utng.r11;

import java.time.LocalDate;

public class Empleado_Isaac extends Persona_Isaac {
    private float salario;

    public Empleado_Isaac(String nombre, byte edad, LocalDate fechaNacimiento, float salario) {
        super(nombre, edad, fechaNacimiento);
        this.salario = salario;
    }

    public float getSalario() {
        return salario;
    }
}
