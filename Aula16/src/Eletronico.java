public class Eletronico extends Produto{
    String marca;

    public Eletronico(String nome, double precoBase, String marca) {
        super(nome, precoBase);
        this.marca = marca;
    }

    @Override
    public double calcularPrecoFinal() {
        double desconto = 0.10;
        return precoBase * (1 - desconto);
    }
}
