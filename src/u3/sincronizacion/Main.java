package u3.sincronizacion;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Arreglo arreglo = new Arreglo(6);
        Escritor escritor1 = new Escritor(arreglo, 1);
        Escritor escritor2 = new Escritor(arreglo, 11);
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(escritor1);
        executorService.execute(escritor2);
        executorService.shutdown();
        try {
            boolean tareasTerminaron = executorService.awaitTermination(1, TimeUnit.MINUTES);
            if (tareasTerminaron) System.out.println(arreglo);
            else System.out.println("Tiempo agotado");
        } catch (InterruptedException e) {
            System.out.println("Hubo una interrupcion");
        }
    }
}
