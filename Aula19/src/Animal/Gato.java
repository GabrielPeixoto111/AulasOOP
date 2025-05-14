package Animal;

public class Gato extends Animal{
    public Gato(String nome, String especie) {
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
}
