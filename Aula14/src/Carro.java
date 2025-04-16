public class Carro extends  Veiculo{
    private Integer nroPortas;

    public Carro(String marca, String modelo, Integer ano, Integer nroPortas) {
        super(marca, modelo, ano);
        this.nroPortas = nroPortas;
    }

    public Integer getNroPortas() {
        return nroPortas;
    }

    public void setNroPortas(Integer nroPortas) {
        this.nroPortas = nroPortas;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Marca: " + getMarca() + "\nModelo: " + getModelo() + "\nAno: " + getAno() +
                "\nNúmero de portas: " + nroPortas);
    }
}
