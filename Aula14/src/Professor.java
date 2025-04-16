public class Professor extends Pessoa{
    private Double salario;
    private String disciplina;

    public Professor(String nome, Integer idade, Double salario, String disciplina) {
        super(nome, idade);
        this.salario = salario;
        this.disciplina = disciplina;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public void apresentar() {
        System.out.println("Nome: " + getNome() + "\nIdade: " + getIdade() + "\nSalário: " + salario + "\nDisciplina: " + disciplina);
    }
}
