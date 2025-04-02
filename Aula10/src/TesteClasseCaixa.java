public class TesteClasseCaixa {
    public static void main(String[] args) {
        Caixa<String> caixa1 = new Caixa<>("Olá, meu nome é Rhafael");
        Caixa<Double> caixa2 = new Caixa<>(1500.00);

        System.out.println(caixa1.getConteudo());
        System.out.println(caixa2.getConteudo());

        System.out.println(caixa1.getConteudo().getClass());
    }
}
