package Exercicio1;

public class Circulo implements AreaCalculavel{
    private Double raio;

    public Circulo(Double raio) {
        this.raio = raio;
    }

    @Override
    public Double calcularArea() {
        return Math.PI * (raio * raio);
    }
}
