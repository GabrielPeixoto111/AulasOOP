public class Cachorro extends Animal{
    String raca;
    String cor;

    public Cachorro(String nome, String raca, String cor) {
        super(nome);
        this.raca = raca;
        this.cor = cor;
    }

    @Override
    public void emitirSom() {
        System.out.println("Au! Au!");
    }
}
