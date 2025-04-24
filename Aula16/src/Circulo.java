public class Circulo extends FigurasGeometricas{
    Double raio;

    public Circulo(Double raio) {
        this.raio = raio;
    }

    @Override
    public Double calcularArea() {
        Double area = 3.141 * raio;
        return area;
    }

    @Override
    public Double calcularPerimetro() {
        Double perimetro = 2 * 3.141 * raio;
        return perimetro;
    }
}
