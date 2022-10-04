package u2.problemas;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Problema2 {
    public static void main(String[] args) {
        Character[] c = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        List<Character> caracteres = new LinkedList<>(Arrays.asList(c));
        List<Character> caracteresInvertidos = new LinkedList<>(caracteres);
        Collections.reverse(caracteresInvertidos);
        System.out.println("Orden normal: " + caracteres);
        System.out.println("Orden invertido: " + caracteresInvertidos);
    }
}
