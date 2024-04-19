package mx.utng.r11;

import java.time.LocalDate;

public class Programador_Isaac extends Empleado_Isaac {

    private String lenguajePrincipal;

    public Programador_Isaac(String nombre,
                       byte edad,
                       LocalDate fechaNacimiento,
                       float salario,
                       String lenguajePrincipal) {

        super(nombre, edad, fechaNacimiento, salario);
        this.lenguajePrincipal = lenguajePrincipal;
    }

    public static void main(String[] args) {

        Programador_Isaac programador = new Programador_Isaac("Luis Manuel", (byte) 18,
                                                  LocalDate.of(2005, 11, 15),
                                                  68000f, "JavScrip");

        System.out.println("Nombre: " + programador.getNombre());
        System.out.println("Edad: " + programador.getEdad());
        System.out.println("Fecha de Nacimiento: " + programador.getFechaNacimiento());
        System.out.println("Salario: $" + programador.getSalario());
        System.out.println("Lenguaje Principal: " + programador.lenguajePrincipal);
    }
}

