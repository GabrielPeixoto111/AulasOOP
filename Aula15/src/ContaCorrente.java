public class ContaCorrente {
    protected float saldo;

    public ContaCorrente(float saldo) {
        saldo = saldo;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        saldo = saldo;
    }

    public void depositar(Float valor) {
        saldo += valor;
    }

    public Boolean sacar(Float valor) {
        if (saldo >= valor) {
            saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public Boolean transferir(ContaCorrente conta) {
        if(saldo >= conta.saldo) {
            conta.saldo += saldo;
            saldo -= conta.saldo;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return("Saldo: " + saldo);
    }
}