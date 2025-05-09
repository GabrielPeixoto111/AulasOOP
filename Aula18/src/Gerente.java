public class Gerente extends Funcionario {

    public Gerente(String nome, Double salario) {
        super(nome, salario);
    }

    @Override
    public void aumentarSalario() {
        setSalario(getSalario() * 1.1);
    }
}
