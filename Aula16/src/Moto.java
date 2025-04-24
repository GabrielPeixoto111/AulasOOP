public class Moto extends Veiculo {
    String modelo;
    int rodas;

    public Moto(String modelo) {
        super("Moto");
        this.modelo = modelo;
        this.rodas = 2;
    }

    @Override
    public void acelerar(int incremento) {
        super.acelerar(incremento);
        System.out.println("Moto modelo " + this.modelo + " está acelerando.");
    }

    @Override
    public void desacelerar(int decremento) {
        super.desacelerar(decremento);
        if(velocidade < 0) {
            velocidade = 0;
        }
        System.out.println("Moto modelo " + this.modelo + " está desacelerando.");
    }
}
