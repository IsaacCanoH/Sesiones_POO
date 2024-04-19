package mx.utng.r11;

import java.time.LocalDate;

public class DBA_Isaac extends Empleado_Isaac {

    private String especialidad;

    public DBA_Isaac(String nombre,
                byte edad,
                LocalDate fechaNacimiento,
                float salario,
                String especialidad) {

        super(nombre, edad, fechaNacimiento, salario);
        this.especialidad = especialidad;
    }

    public static void main(String[] args) {

        DBA_Isaac dba = new DBA_Isaac("Isaac", (byte) 18,
                            LocalDate.of(2005, 4, 29),
                            87000f, "Python");

        System.out.println("Nombre: " + dba.getNombre());
        System.out.println("Edad: " + dba.getEdad());
        System.out.println("Fecha de Nacimiento: " + dba.getFechaNacimiento());
        System.out.println("Salario: $" + dba.getSalario());
        System.out.println("Especialidad: " + dba.especialidad);
    }
}

