public class Programador extends Funcionario{
    public Programador(String nome, Double salario) {
        super(nome, salario);
    }

    @Override
    public void aumentarSalario() {
        setSalario(getSalario() * 1.2);
    }
}
