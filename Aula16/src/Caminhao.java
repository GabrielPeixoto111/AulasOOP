public class Caminhao extends Veiculo {
    String modelo;
    int rodas;

    public Caminhao(String modelo) {
        super("Caminhão");
        this.modelo = modelo;
        this.rodas = 6;  // Caminhões geralmente têm mais rodas
    }

    @Override
    public void acelerar(int incremento) {
        super.acelerar(incremento);
        System.out.println("Caminhão modelo " + this.modelo + " está acelerando.");
    }

    @Override
    public void desacelerar(int decremento) {
        super.desacelerar(decremento);
        if(velocidade < 0) {
            velocidade = 0;
        }
        System.out.println("Caminhão modelo " + this.modelo + " está desacelerando.");
    }
}
