package Exercicio1;

public class TesteAreaCalculavel {
    public static void main(String[] args) {
        AreaCalculavel[] figuras = new AreaCalculavel[5];

        figuras[0] = new Quadrado(4.00);
        figuras[1] = new Retangulo(3.00, 4.00);
        figuras[2] = new Circulo(3.00);
        figuras[3] = new Circulo(1.5);
        figuras[4] = new Quadrado(6.00);

        for(int i = 0; i < figuras.length; i++) {
            System.out.println("A área da figura: " + (i + 1) + ":" + figuras[i].calcularArea());
        }
    }
}