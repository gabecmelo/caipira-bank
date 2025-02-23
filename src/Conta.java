import java.util.Optional;

public interface Conta {
    public double consultarSaldo();
    public double depositar(double valor);
    public boolean remover(double valor);
    public void transferir(ContaBancaria contaExterna, double valor);
}