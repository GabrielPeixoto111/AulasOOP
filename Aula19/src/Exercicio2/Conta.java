package Exercicio2;

public class Conta {
    private Double saldo;

    public Conta(Double saldo) {
        this.saldo = saldo;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void sacar(Double valor) {
        if(saldo >= valor) {
            saldo -= valor;
            System.out.println("Operação realizada com sucesso!");
        } else {
            System.out.println("Fundos insuficientes");
        }
    }

    public void depositar(Double valor) {
        if(valor > 0) {
            saldo += valor;
            System.out.println("Operação realizada com sucesso!");
        } else {
            System.out.println("Por favor insira um valor inteiro");
        }
    }
}
