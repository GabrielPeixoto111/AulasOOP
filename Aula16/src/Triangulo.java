public class Triangulo extends FigurasGeometricas{
    Double hipotenusa;
    Double base;
    Double altura;

    public Triangulo(Double hipotenusa, Double base, Double altura) {
        this.hipotenusa = hipotenusa;
        this.base = base;
        this.altura = altura;
    }

    @Override
    public Double calcularArea() {
        Double area = (base * altura)/2;
        return area;
    }

    @Override
    public Double calcularPerimetro() {
        Double perimetro = hipotenusa + base + altura;
        return perimetro;
    }
}
