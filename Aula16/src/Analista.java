public class Analista extends Funcionario{
    int horasTrabalhadas;
    double valorHora;

    public Analista(String nome, double salarioBase, int horasTrabalhadas, double valorHora) {
        super(nome, salarioBase);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (horasTrabalhadas * valorHora);
    }
}
