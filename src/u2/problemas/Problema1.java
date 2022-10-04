package u2.problemas;

import java.util.*;

public class Problema1 {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        Random r = new Random();
        for (int i = 0; i < 25; i++) list.add(r.nextInt(100));
        System.out.println(list);
        Collections.sort(list);
        System.out.println("Ordenado: " + list);
        int suma = 0;
        for (int n : list) suma += n;
        System.out.println("Suma: " + suma);
        System.out.printf("Promedio: %.2f\n", (float) (suma / list.size()));

    }
}
