package Exercicio1;

public class Retangulo implements AreaCalculavel {
    private Double base;
    private Double altura;

    public Retangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public Double calcularArea() {
        return base * altura;
    }
}
