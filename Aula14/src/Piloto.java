public class Piloto extends Funcionario{
    private String licenca;

    public Piloto(String nome, String cpf, String licenca) {
        super(nome, cpf);
        this.licenca = licenca;
    }

    public String getLicenca() {
        return licenca;
    }

    public void setLicenca(String licenca) {
        this.licenca = licenca;
    }

    @Override
    public void exibirDados() {
        System.out.println("Nome: " + getNome() + "\nCpf: " + getCpf() + "\nLicença: " + licenca);
    }
}
