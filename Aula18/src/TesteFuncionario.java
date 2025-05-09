public class TesteFuncionario {
    public static void main(String[] args) {
        Gerente joao = new Gerente("João", 100.00);
        Programador carlos = new Programador("Carlos", 200.00);
        System.out.println("Gerente: " + joao.getNome() + " / " + joao.getSalario());
        System.out.println("Programador: " + carlos.getNome() + " / " + carlos.getSalario());
        joao.aumentarSalario();
        carlos.aumentarSalario();
        System.out.println("Gerente: " + joao.getNome() + " / " + joao.getSalario());
        System.out.println("Programador: " + carlos.getNome() + " / " + carlos.getSalario());
    }
}
