package Animal;

public class TesteAnimal {
    public static void main(String[] args) {
        Gato gato = new Gato("Bichano", "Siamês");
        Passaro passaro = new Passaro("Bico", "Arara");

        gato.comer();
        gato.dormir();

        passaro.comer();
        passaro.aprenderVoar();
        passaro.dormir();

        podeVoar(passaro);
    }

    public static void podeVoar (Voar animal) {
        animal.aprenderVoar();
    }
}