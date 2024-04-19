import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        String[] cadenas = new String[5];
        cadenas[0] = "zanahoria";
        cadenas[1] = "cilatro";
        cadenas[2] = "lechuga";
        cadenas[3] = "repollo";
        cadenas[4] = "coliflor";

       //cadenas[5] = "jicama";
        System.out.println(Integer.MAX_VALUE);

        for (String c : cadenas) {
            System.out.println(c);
        }
        
        System.out.println("----Fori----");
        for (int i = 0; i < cadenas.length; i++) {
            System.out.println(cadenas[i]);
        }
        
        System.out.println("---Arreglo----");       List<String> verduras = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            verduras.add("Verdura "+(i+1));
        }
        for (String v : verduras) {
            System.out.println(v);
        }
        System.out.println("-----Cambiar-----");
        verduras.set(0, "zanahoria");
        verduras.set(1, "cilantro");
        verduras.set(2, "cebolla");
        verduras.set(3, "ajo");
        verduras.remove(4);
        for (int i = 4; i < verduras.size(); i++) {
            verduras.remove(i);
        }
        verduras.remove("Verdura 7"); 
        verduras.remove("Verdura 9");
        Collections.addAll(verduras, "repoyo", "lechuga", "coliflor");
        System.out.println(verduras.get(0));
        for (String v : verduras) {
            System.out.println(v);
        }

        Collections.reverse(verduras);
        System.out.println(verduras);

        System.out.println("El mas pequeño es: "+ Collections.min(verduras));
        System.out.println("El mas pequeño es: "+ Collections.max(verduras));

        Collections.sort(verduras);
        System.out.println(verduras);

        System.out.println("La lechuga esta en: "+ Collections.binarySearch(verduras, "lechuga"));
        System.out.println("El cilandro esta en: "+ Collections.binarySearch(verduras, "cilandor"));

        Collections.addAll(verduras, "lechuga", "lechuga", "lechuga");
        System.out.println(verduras);

        Collections.shuffle(verduras);
        System.out.println(verduras);

        System.out.println("Hay "+Collections.frequency(verduras, "lechuga")+" lechugas");
        System.out.println("Jose dice con lechuga o sin lechuga");

    }

}
