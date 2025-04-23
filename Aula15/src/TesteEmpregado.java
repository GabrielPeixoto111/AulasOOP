public class TesteEmpregado {
    public static void main(String[] args) {
        Empregado empregado = new Empregado("João", 5000f);
        Gerente gerente = new Gerente("Carlos", 9000f, "Marketing");
        Vendedor vendedor = new Vendedor("Jonas", 6500f, 0.2f);
        System.out.println(empregado.toString());
        System.out.println("######################");
        System.out.println(gerente.toString());
        System.out.println("######################");
        System.out.println(vendedor.toString());
    }
}