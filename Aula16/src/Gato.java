public class Gato extends Animal{
    String raca;
    String cor;

    public Gato(String nome, String raca, String cor) {
        super(nome);
        this.raca = raca;
        this.cor = cor;
    }

    @Override
    public void emitirSom() {
        System.out.println("Miau!");
    }
}
