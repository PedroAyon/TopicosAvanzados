package u3.banco;

public class CuentaCompartida {
    private int saldo;

    public CuentaCompartida(int saldo) {
        this.saldo = saldo;
    }

    public synchronized void depositar(Cliente cliente, int cantidad) {
        saldo += cantidad;
        System.out.printf("%s deposito $%d, saldo actual: %d\n", cliente.getNombre(), cantidad, saldo);
    }

    public synchronized void retirar(Cliente cliente, int cantidad) {
        if (saldo - cantidad < 0) {
            System.out.printf("%s intento retirar $%d, saldo actual: %d, transaccion denegada. \n", cliente.getNombre(), cantidad, saldo);
            return;
        }
        saldo -= cantidad;
        System.out.printf("%s retiro $%d, saldo actual: %d\n", cliente.getNombre(), cantidad, saldo);
    }
}
