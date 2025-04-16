public class Gato extends Animal{
    public Gato(String nome, Integer idade) {
        super(nome, idade);
    }

    @Override
    public void fazerSom() {
        System.out.println("Miau!");
    }
}
