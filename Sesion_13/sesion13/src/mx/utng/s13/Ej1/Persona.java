package mx.utng.s13.Ej1;

public class Persona {
    private String nombre;
    private String apellidos;

    public Persona(String nombre, String apellidos){
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void mostrarDatos(){
        System.out.println("Persona: Nombre->"+nombre+" apellido->"+apellidos);
    }
}

