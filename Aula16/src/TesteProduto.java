public class TesteProduto {
    public static void main(String[] args) {
        Produto eletronico = new Eletronico("Smartphone", 1000.00, "Samsung");
        Produto roupa = new Roupa("Camiseta", 50.00, "M");
        Produto alimento = new Alimento("Arroz", 30.00, "12/2025");

        Produto[] produtos = {eletronico, roupa, alimento};

        for (Produto produto : produtos) {
            System.out.println("Produto: " + produto.nome);
            System.out.println("Preço final: R$ " + produto.calcularPrecoFinal());
            System.out.println();
        }
    }
}
