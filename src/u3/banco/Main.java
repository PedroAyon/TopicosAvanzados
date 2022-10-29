package u3.banco;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        CuentaCompartida cuentaCompartida = new CuentaCompartida(10000);
        Cliente cliente1 = new Cliente("Pedro", cuentaCompartida);
        Cliente cliente2 = new Cliente("Ali", cuentaCompartida);
        Cliente cliente3 = new Cliente("Luis", cuentaCompartida);
        Cliente cliente4 = new Cliente("Ximena", cuentaCompartida);
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(cliente1);
        executorService.execute(cliente2);
        executorService.execute(cliente3);
        executorService.execute(cliente4);
        executorService.shutdown();
        try {
            boolean transaccionesTerminaron = executorService.awaitTermination(1, TimeUnit.MINUTES);
            if (transaccionesTerminaron) System.out.println("Fin de las transacciones");
            else System.out.println("Tiempo agotado");
        } catch (InterruptedException e) {
            System.out.println("Hubo una interrupcion");
        }
    }
}
