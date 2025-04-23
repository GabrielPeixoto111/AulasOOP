public class TesteIngresso {
    public static void main(String[] args) {
        Ingresso ingresso = new Ingresso(100f);
        IngressoVIP ingressoVIP = new IngressoVIP(100f, 50f);
        System.out.println("Ingresso normal:\n" + ingresso);
        System.out.println("Ingresso VIP:\n" + ingressoVIP);
    }
}
