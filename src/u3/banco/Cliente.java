package u3.banco;

import java.util.Random;

public class Cliente implements Runnable {
    private final String nombre;
    private final CuentaCompartida cuenta;
    private final Random random = new Random();

    public Cliente(String nombre, CuentaCompartida cuenta) {
        this.nombre = nombre;
        this.cuenta = cuenta;
    }

    @Override
    public void run() {
        int numeroDeTransacciones = random.nextInt(10, 50);
        for (int contador = 0; contador < numeroDeTransacciones; contador++) {
            try {
                Thread.sleep(random.nextInt(1000));
                if (random.nextBoolean()) depositar(random.nextInt(50, 1000));
                else retirar(random.nextInt(50, 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void depositar(int cantidad) {
        cuenta.depositar(this, cantidad);
    }

    public void retirar(int cantidad) {
        cuenta.retirar(this, cantidad);
    }

    public String getNombre() {
        return nombre;
    }
}
