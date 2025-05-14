public class ContaTeste {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();

        cc.depositar(1000.00);
        cp.depositar(1000.00);

        cc.sacar(500.00);
        cp.sacar(500.00);

        System.out.println("Saldo da conta corrente: " + cc.getsaldo());
        System.out.println("Saldo da conta poupança: " + cp.getsaldo());
    }
}
