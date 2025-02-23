public class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca(double saldo, TipoConta tipoConta) {
        super(saldo, tipoConta);
    }

    @Override
    public double depositar(double valor) {
        System.out.println("Taxa de depósito de 1% aplicada");
        double taxa = 0.99;
        double valorFinal = valor * taxa;
        super.depositar(valorFinal);
        return valorFinal;
    }
}
