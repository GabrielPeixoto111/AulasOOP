import java.util.ArrayList;
import java.util.List;

public class ComissarioDeBordo extends Funcionario{
    List<String> IdiomasFalados = new ArrayList<>();

    public ComissarioDeBordo(String nome, String cpf, List<String> idiomasFalados) {
        super(nome, cpf);
        IdiomasFalados = idiomasFalados;
    }

    @Override
    public void exibirDados() {
        System.out.println("Nome: " + super.getNome() + "\nCPF: " + super.getCpf() + "\nIdiomas falados: " + IdiomasFalados);
    }
}
