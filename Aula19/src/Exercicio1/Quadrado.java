package Exercicio1;

public class Quadrado implements AreaCalculavel {
    private Double lado;

    public Quadrado(Double lado) {
        this.lado = lado;
    }

    @Override
    public Double calcularArea() {
        return lado * lado;
    }
}
