public class Aluno extends Pessoa{
    private String matricula;

    public Aluno(String nome, Integer idade, String matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public void apresentar() {
        System.out.println("Nome: " + getNome() + "\nIdade: " + getIdade() + "\nMatrícula: " + matricula);
    }
}
