public class Vendedor extends Empregado{
    private float percentualComissao;

    public Vendedor(String nome, Float salario, float percentualComissao) {
        super(nome, salario);
        this.percentualComissao = percentualComissao;
    }

    public float getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(float percentualComissao) {
        this.percentualComissao = percentualComissao;
    }

    public Float calcularSalario() {
        return(salario + (salario * percentualComissao));
    }

    @Override
    public String toString() {
        return("Nome: " + getNome() + "\nSalário sem comissão: " + salario +
                "\nSalário com comissão: " + calcularSalario() + "\nPercentual de comissão: " + percentualComissao);
    }
}
