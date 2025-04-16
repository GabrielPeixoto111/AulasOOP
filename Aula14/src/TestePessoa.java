public class TestePessoa {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("João", 22, "12345");
        Professor professor = new Professor("José", 42, 10.000, "Fundamentos da computação");

        aluno.apresentar();
        professor.apresentar();
    }
}
