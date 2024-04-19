package mx.utng.s13.Ej1;

public class Profesor extends Persona {
     private String idProfesor;

     public Profesor(String nombre, String apellidos, String idProfesor){
        super(nombre, apellidos);
        this.idProfesor = idProfesor;
     }

     public String getIdProfesor() {
         return idProfesor;
     }

     public void setIdProfesor(String idProfesor) {
         this.idProfesor = idProfesor;
     }
    
     @Override
     public void mostrarDatos() {
         super.mostrarDatos();
         System.out.println("Profesor: Id de Profesor->"+idProfesor);
     }
}
