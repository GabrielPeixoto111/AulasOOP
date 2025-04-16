import java.util.ArrayList;
import java.util.List;

public class TesteAnimal {
    public static void main(String[] args) {
        Cachorro thor = new Cachorro("Thor", 7);
        Cachorro meg = new Cachorro("Meg", 2);
        Gato tom = new Gato("Tom", 4);
        Gato mingau = new Gato("Mingau", 1);
        ArrayList<Animal> animais = new ArrayList<Animal>();
        animais.add(thor);
        animais.add(mingau);
        animais.add(meg);
        animais.add(tom);

        for(Animal a : animais) {
            a.fazerSom();
        }
    }


}
