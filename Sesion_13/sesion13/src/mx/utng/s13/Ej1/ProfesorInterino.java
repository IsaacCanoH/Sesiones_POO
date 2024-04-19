package mx.utng.s13.Ej1;

import java.time.LocalDate;

public class ProfesorInterino extends Profesor {
    private LocalDate fechaTerminacion;

    public ProfesorInterino(String nombre, String apellidos, String idProfesor){
        super(nombre, apellidos, idProfesor);
    }

    public LocalDate getFechaTerminacion() {
        return fechaTerminacion;
    }

    public void setFechaTerminacion(LocalDate fechaTerminacion) {
        this.fechaTerminacion = fechaTerminacion;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Profesor Interino: fecha de terminacion de contrato->"+fechaTerminacion);
    }
}

