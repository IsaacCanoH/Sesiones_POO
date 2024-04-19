package mx.untg.s34;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@RestController
@RequestMapping("/casas")
public class TodaLogica {
    private final CasaRepository repository;

    @Autowired    
    public TodaLogica(CasaRepository repository) {
        this.repository = repository;
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public void guardarCasa(@RequestBody Casa casa) {
        if (casa.getJefeDeFamilia() == null) {
            throw new RuntimeException("Se debe de tener un Jefe de familia"); // Corrección aquí: usar throw para lanzar la excepción
        }
        casa.setJefeDeFamilia(casa.getJefeDeFamilia().toUpperCase());

        ArrayList<String> otrosMayusculas = new ArrayList<>();

        for (String nombre : otrosMayusculas) {
            otrosMayusculas.add(nombre.toUpperCase());
        }

        casa.setOtros(otrosMayusculas);

        repository.save(casa);
    }
}
