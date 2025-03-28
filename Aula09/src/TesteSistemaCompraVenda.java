public class Teste {
    public static void main (String[] args) {
        Produto teste1 = new Produto("teste1", 10.0, 10);
        Produto teste2 = new Produto("teste2", 2.3, 4);
        Produto teste3 = new Produto("teste3", 5.5, 9);
        Produto[] arrayProdutos = {teste1, teste2, teste3};
        Pedido pedido = new Pedido(arrayProdutos);
        System.out.println(pedido.calcularPreço());
    }
}