public class TesteFigurasGeometricas {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(5.0, 3.0);
        Circulo circulo = new Circulo(7.0);
        Triangulo triangulo = new Triangulo(17.0, 15.0, 8.0);
        System.out.println("Área do retângulo: " + retangulo.calcularArea() + "\nPerímetro do retângulo: "  + retangulo.calcularPerimetro());
        System.out.println("Área do círculo: " + circulo.calcularArea() + "\nPerímetro do círculo: " + circulo.calcularPerimetro());
        System.out.println("Área do triângulo: " + triangulo.calcularArea() + "\nPerímetro do triângulo: " + triangulo.calcularPerimetro());
    }
}
