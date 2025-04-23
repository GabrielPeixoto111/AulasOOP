import java.util.List;

public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario joao = new Funcionario("João", "111");
        Piloto carlos = new Piloto("Carlos", "222", "Licença1");
        ComissarioDeBordo jonas = new ComissarioDeBordo("Jonas", "333", List.of("Inglês", "Espanhol"));

        joao.exibirDados();
        carlos.exibirDados();
        jonas.exibirDados();
    }
}
