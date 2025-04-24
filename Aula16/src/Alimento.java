public class Alimento extends Produto{
    String validade;

    public Alimento(String nome, double precoBase, String validade) {
        super(nome, precoBase);
        this.validade = validade;
    }

    @Override
    public double calcularPrecoFinal() {
        double desconto = 0.05;
        return precoBase * (1 - desconto);
    }

}
