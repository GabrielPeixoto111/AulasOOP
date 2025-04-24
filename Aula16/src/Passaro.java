public class Passaro extends Animal{
    String especie;

    public Passaro(String nome, String especie) {
        super(nome);
        this.especie = especie;
    }

    @Override
    public void emitirSom() {
        System.out.println("Piu!");
    }
}
