package Exercicio01;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class GerarDadosAleatorios {
    public static Integer gerarIdade() {
        return new Random().nextInt(0, 120);
    }

    public static String gerarNomeCompleto() {
        Random random = new Random();
        String nome = NOMES.get(random.nextInt(NOMES.size()));
        String sobrenome = SOBRENOMES.get(random.nextInt(SOBRENOMES.size()));
        return String.format("%s %s", nome, sobrenome);
    }

    private static final List<String> NOMES = Arrays.asList(
            "Ana", "Carlos", "Fernanda", "Lucas", "Maria", "João", "Paula", "Ricardo", "Camila", "Paulo",
            "Eduardo", "Beatriz", "Gustavo", "Isabela", "Felipe", "Aline", "Roberto", "Juliana", "Matheus", "Larissa",
            "José", "Sofia", "Rafael", "Laura", "Marcos", "Luana", "Tiago", "Tatiane", "Bruna", "Felipe", "Daniela",
            "Victor", "Samantha", "Caio", "Tânia", "Leandro", "Carla", "Mariana", "Fábio", "Patrícia", "Daniel", "Mônica",
            "Luiz", "Alice", "Thiago", "André", "Gabriela", "Ricardo", "Simone", "Vera", "Eloá", "Cássio", "Viviane",
            "Douglas", "Cíntia", "Bruno", "Elaine", "Giovanna", "Rogerio", "Catarina", "Lúcio", "Renata", "Amanda",
            "José", "Rita", "Julio", "Cláudia", "Leila", "Henrique", "Ivana", "Rodrigo", "Vinícius", "Solange", "Lívia",
            "Andressa", "Luciana", "Marcelo", "Valéria", "Sandra", "Rodrigo", "Marcia", "Roberta", "Joana", "Tânia",
            "Margarida", "Fátima", "Sandra", "Augusto", "Ana Carolina", "Mariana", "Gustavo", "Lucas", "Raquel", "Cláudia"
    );

    // Lista de 100 sobrenomes comuns no Brasil
    private static final List<String> SOBRENOMES = Arrays.asList(
            "Silva", "Santos", "Oliveira", "Pereira", "Costa", "Rodrigues", "Souza", "Alves", "Nascimento", "Lima",
            "Gomes", "Ribeiro", "Martins", "Freitas", "Carvalho", "Moura", "Nascimento", "Ferreira", "Araújo", "Dias",
            "Gonçalves", "Pinto", "Teixeira", "Moreira", "Barbosa", "Mendes", "Cavalcanti", "Fonseca", "Cruz", "Lopes",
            "Vieira", "Melo", "Monteiro", "Cardoso", "Machado", "Ramos", "Castro", "Andrade", "Borges", "Figueiredo", "Silveira",
            "Bueno", "Tavares", "Campos", "Araujo", "Martins", "Pimentel", "Correia", "Lima", "Silveira", "Campos",
            "Lopes", "Brandão", "Viana", "Sá", "Moreira", "Magalhães", "Freitas", "Medeiros", "Costa", "Pinheiro",
            "Bastos", "Nunes", "Farias", "Teixeira", "Queiroz", "Menezes", "Lima", "Vieira", "Batista", "Oliveira",
            "Teles", "Sousa", "Pacheco", "Santos", "Nascimento", "Ribeiro", "Cavalcante", "Lima", "Siqueira", "Cardoso",
            "Castro", "Barros", "Mendes", "Tavares", "Vasconcelos", "Pereira", "Melo", "Ribeiro", "Menezes", "Nóbrega",
            "Pinheiro", "Fernandes", "Rangel", "Abreu", "Lima", "Borges", "Matos", "Pimentel", "Valença", "Almeida"
    );
}
