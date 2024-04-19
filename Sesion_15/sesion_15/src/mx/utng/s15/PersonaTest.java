package mx.utng.s15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

publicublic static void main(String[] args) {

    Persona persona1 = new Persona("Reynaldo", "Peña", 1.8F);
    Persona persona2 = new Persona("Pedrito", "MeElectrucutaste", 1.6F);
    Persona persona3 = new Persona("Jackeline", "Robles", 1.6F);
    Persona persona4 = new Persona("Josue", "Robles", 1.7F);
    Persona persona5 = new Persona("Misael", "Rea", 1.7F);

    List<Persona> personas = new ArrayList<>();
    Collections.addAll(personas, persona1, persona2, persona3, persona4, persona5);

    for (Persona persona : personas) {
        System.out.println(persona.getNombre()+ " "+ persona.getApellidos()+" : "+persona.getEstatura());
        
    }

    //Comparando personas
    for (Persona persona : personas) {
        System.out.println(persona1.compareTo(persona));
        
    }

}
