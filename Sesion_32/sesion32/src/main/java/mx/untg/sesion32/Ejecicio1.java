package mx.untg.sesion32;

import java.time.Duration;
import java.time.LocalTime;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ejecicio1 {
    static void obtenerPromedio(Stream<Integer> ids){
        //Tiempo de inicio
        LocalTime inicio = LocalTime.now();

        double promedio = ids.mapToDouble(id -> new SistemaMedicion().leer(id)) //pasamos el string de numeros
        .average()           //retorna el promedio
        .orElse(0);    //retorna 0 si no se pudieron obtener los valores

        //Calculamos la duracion entre el inicio y el momento actual
        Duration tiempo = Duration.between(inicio, LocalTime.now());

        System.out.println((Math.round(promedio *100.)/100.)+" en "+tiempo.toMillis() +"ms");
    }

    public static void main(String[] args) {
        List<Integer> ids = IntStream.range(1, 11).boxed().collect(Collectors.toList());

        obtenerPromedio(ids.stream());
        obtenerPromedio(ids.parallelStream());
    }
}
