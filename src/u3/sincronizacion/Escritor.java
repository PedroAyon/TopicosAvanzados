package u3.sincronizacion;

public class Escritor implements Runnable {
    private final Arreglo arreglo;
    private final int valorInicial;

    public Escritor(Arreglo arreglo, int valorInicial) {
        this.arreglo = arreglo;
        this.valorInicial = valorInicial;
    }

    @Override
    public void run() {
        for (int i = valorInicial; i < valorInicial + 3; i++) arreglo.agregar(i);
    }
}
