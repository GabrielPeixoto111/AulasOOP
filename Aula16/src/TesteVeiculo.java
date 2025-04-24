public class TesteVeiculo {
    public static void main(String[] args) {
        Veiculo carro = new Carro("Fusca");
        Veiculo moto = new Moto("Yamaha R1");
        Veiculo caminhao = new Caminhao("Volvo FH");

        Veiculo[] veiculos = {carro, moto, caminhao};

        for (Veiculo veiculo : veiculos) {
            veiculo.acelerar(20);
            veiculo.desacelerar(10);
        }
    }
}
