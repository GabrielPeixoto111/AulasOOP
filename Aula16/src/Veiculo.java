public class Veiculo {
    String tipo;
    int velocidade;

    public Veiculo(String tipo) {
        this.tipo = tipo;
        this.velocidade = 0;
    }

    public void acelerar(int incremento) {
        this.velocidade += incremento;
        System.out.println(this.tipo + " acelerou para " + this.velocidade + " km/h.");
    }

    public void desacelerar(int decremento) {
        this.velocidade -= decremento;
        if(velocidade < 0) {
            velocidade = 0;
        }
        System.out.println(this.tipo + " desacelerou para " + this.velocidade + " km/h.");
    }
}
