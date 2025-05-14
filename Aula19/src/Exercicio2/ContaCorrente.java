package Exercicio2;

public class ContaCorrente extends Conta implements Tributavel{
    public ContaCorrente(Double saldo) {
        super(saldo);
    }

    @Override
    public Double calculaTributos() {
        return super.getSaldo() * 0.01;
    }
}
