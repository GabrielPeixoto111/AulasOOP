package Exercicio2;

public class TesteTributavel {
    public static void main(String[] args) {
        ContaPoupança cp = new ContaPoupança(2000.00);
        ContaCorrente cc = new ContaCorrente(1000.00);
        SeguroDeVida seguroDeVida = new SeguroDeVida();

        System.out.println("Conta poupança não é tributável!");
        System.out.println("Conta corrente tem tributo: " + cc.calculaTributos());
        System.out.println("Seguro de vida tem tributo: " + seguroDeVida.calculaTributos());
    }
}
