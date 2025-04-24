public class Carro extends Veiculo {
    String modelo;
    int rodas;

    public Carro(String modelo) {
        super("Carro");
        this.modelo = modelo;
        this.rodas = 4;  // Carros geralmente têm 4 rodas
    }

    @Override
    public void acelerar(int incremento) {
        super.acelerar(incremento);
        System.out.println("Carro modelo " + this.modelo + " está acelerando.");
    }

    @Override
    public void desacelerar(int decremento) {
        super.desacelerar(decremento);
        if(velocidade < 0) {
            velocidade = 0;
        }
        System.out.println("Carro modelo " + this.modelo + " está desacelerando.");
    }
}