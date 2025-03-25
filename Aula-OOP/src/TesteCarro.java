public class TesteCarro {
    public static void main(String[] args) {
        Carro civic = new Carro("Honda", "CIVC", 2025);
        civic.atualizarQuilometragem(1000.00);
        civic.fazerRevisão();
        civic.trocarOleo();
    }
}
