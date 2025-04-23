public class TesteAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal("Cavalo", 10);
        Animal gato = new Gato("Gato", 4);
        Animal cachorro = new Cachorro("Cachorro", 12);

        animal.fazerSom();
        gato.fazerSom();
        cachorro.fazerSom();
    }
}
