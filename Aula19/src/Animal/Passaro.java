package Animal;

public class Passaro extends Animal implements Voar {
    public Passaro(String nome, String especie) {
        super(nome, especie);
    }

    @Override
    public void comer() {
        System.out.println(super.getNome() + " está comendo");
    }

    @Override
    public void dormir() {
        System.out.println(super.getNome() + " está dormindo");
    }

    @Override
    public void aprenderVoar() {
        System.out.println(super.getNome() + " está aprendendo a voar");
    }
}
