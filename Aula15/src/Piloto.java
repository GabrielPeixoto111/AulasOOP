public class Piloto extends Funcionario{
    private String licenca;

    public Piloto(String nome, String cpf, String licenca) {
        super(nome, cpf);
        this.licenca = licenca;
    }

    public Piloto(String nome, String cpf) {
        super(nome, cpf);
    }

    @Override
    public void exibirDados() {
        System.out.println("Nome: " + super.getNome() + "\nCPF: " + super.getCpf() + "\nLicença: " + licenca);
    }
}
