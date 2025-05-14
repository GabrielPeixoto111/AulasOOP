public class ContaPoupanca implements Conta {
    private Double saldo = 0.00;
    private Double taxaOperacao = 0.45;

    @Override
    public void depositar(Double valor) {
        this.saldo += valor - taxaOperacao;
    }

    @Override
    public void sacar(Double valor) {
        this.saldo -= valor + taxaOperacao;
    }

    @Override
    public Double getsaldo() {
        return saldo;
    }
}
