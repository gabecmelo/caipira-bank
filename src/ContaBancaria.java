public abstract class ContaBancaria implements Conta {
    protected double saldo;
    private final TipoConta tipoConta;
    private String tc = "";

    public ContaBancaria(double saldo, TipoConta tipoConta) {
        this.saldo = saldo;
        this.tipoConta = tipoConta;
        String s = this.tipoConta == TipoConta.CORRENTE ? "corrente" : "poupança";
        this.tc = s;
    }

    public String getTipoConta() {
        return this.tc;
    }

    @Override
    public double consultarSaldo() {
        return saldo;
    }

    @Override
    public double depositar(double valor) {
        this.saldo += valor;
        return valor;
    }

    @Override
    public boolean remover(double valor) {
        if (this.saldo > valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void transferir(ContaBancaria contaExterna, double valor) {
        boolean transferido = this.remover(valor);
        if (transferido) {
            double valorFinal = contaExterna.depositar(valor);
            System.out.printf("R$%.2f depositado para a conta %s\n", valorFinal, contaExterna.getTipoConta());
        } else {
            System.out.println("Saldo insuficiente para a transferência");
        }
    }
}
