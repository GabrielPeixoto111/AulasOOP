import java.util.ArrayList;

public class ComissarioDeBordo extends Funcionario{
    ArrayList<String> idiomasFalados = new ArrayList<>();

    public ComissarioDeBordo(String nome, String cpf, ArrayList<String> idiomasFalados) {
        super(nome, cpf);
        this.idiomasFalados = idiomasFalados;
    }

    public ArrayList<String> getIdiomasFalados() {
        return idiomasFalados;
    }

    public void setIdiomasFalados(ArrayList<String> idiomasFalados) {
        this.idiomasFalados = idiomasFalados;
    }

    @Override
    public void exibirDados() {
        System.out.println("Nome: " + getNome() + "\nCpf: " + getCpf() + "\nIdiomas Falados: " + idiomasFalados);
    }
}
