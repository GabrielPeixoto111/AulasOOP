public class Programador extends Funcionario{
    int horasTrabalhadas;
    double valorHora;

    public Programador(String nome, double salarioBase, int horasTrabalhadas, double valorHora) {
        super(nome, salarioBase);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (horasTrabalhadas * valorHora);
    }
}
