public class Ingresso {
    protected Float valor;

    public Ingresso(Float valor) {
        this.valor = valor;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return ("Valor do ingresso: " + valor);
    }
}
