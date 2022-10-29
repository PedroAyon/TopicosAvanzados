package u3.sincronizacion;

import java.util.Random;

public class Arreglo {
    private final int[] arreglo;
    private int indiceEscritura;
    private final static Random random = new Random();

    public Arreglo(int size) {
        arreglo = new int[size];
    }

    public synchronized void agregar(int valor) {
        int posicion = indiceEscritura;
        try {
            Thread.sleep(random.nextInt(100));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        arreglo[posicion] = valor;
        System.out.printf("%s escribio %d en el elemento %d\n", Thread.currentThread().getName(), valor, posicion);
        ++indiceEscritura;
        System.out.printf("Siguiente indice de escritura: %d\n", indiceEscritura);
    }

    @Override
    public String toString() {
        StringBuilder cadena = new StringBuilder();
        for (int n : arreglo) cadena.append(n).append(" ");
        return cadena.toString();
    }
}
