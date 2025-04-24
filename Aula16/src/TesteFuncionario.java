public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario gerente = new Gerente("Carlos", 5000.00, 1500.00);
        Funcionario programador = new Programador("Ana", 3000.00, 160, 30.00);
        Funcionario analista = new Analista("João", 3500.00, 150, 25.00);

        Funcionario[] funcionarios = {gerente, programador, analista};

        for (Funcionario funcionario : funcionarios) {
            System.out.println("Funcionario: " + funcionario.nome);
            System.out.println("Salário: R$ " + funcionario.calcularSalario());
            System.out.println();
        }
    }
}
