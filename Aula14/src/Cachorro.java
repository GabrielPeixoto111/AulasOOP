public class Cachorro extends Animal{
    public Cachorro(String nome, Integer idade) {
        super(nome, idade);
    }

    @Override
    public void fazerSom() {
        System.out.println("Au! Au!");
    }
}
