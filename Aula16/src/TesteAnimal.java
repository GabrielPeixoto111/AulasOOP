public class TesteAnimal {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro("Rex", "Labrador", "Amarelo");
        Animal gato = new Gato("Mimi", "Siamês", "Branco");
        Animal passaro = new Passaro("Loro", "Papagaio");

        Animal[] animais = {cachorro, gato, passaro};

        for (Animal animal : animais) {
            animal.emitirSom();
        }
    }
}
