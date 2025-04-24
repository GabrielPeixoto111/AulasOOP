public class Retangulo extends FigurasGeometricas{
    Double base;
    Double altura;

    public Retangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public Double calcularArea() {
        Double area = base * altura;
        return area;
    }

    @Override
    public Double calcularPerimetro() {
        Double perimetro = 2 * base + 2 * altura;
        return perimetro;
    }
}
