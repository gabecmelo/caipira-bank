public class ContaCorrente extends ContaBancaria {

    public ContaCorrente(double saldo, TipoConta tipoConta) {
        super(saldo, tipoConta);
    }

    @Override
    public double depositar(double valor) {
        super.depositar(valor);
        return valor;
    }
}
