public class Roupa extends Produto{
    String tamanho;

    public Roupa(String nome, double precoBase, String tamanho) {
        super(nome, precoBase);
        this.tamanho = tamanho;
    }

    @Override
    public double calcularPrecoFinal() {
        double desconto = 0.20;
        return precoBase * (1 - desconto);
    }
}
