import Exercicio01.*;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class TesteOrdenação {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        File diretorio = new File("C:\\positivo");
        File arquivo = new File(diretorio, "sistema-alunos.csv");

        int op;
        do {
            System.out.println("1 - Ordenação por nome");
            System.out.println("2 - Ordenação por idade");
            System.out.println("Selecione a forma de ordenação dos dados: ");
            op = scanner.nextInt();
        } while (op < 1 || op > 2);

        File newArq;
        var pessoas = ArquivoUtils.leitura(arquivo);
        var time = LocalDateTime.now().toEpochSecond(ZoneOffset.UTC);

        switch (op) {
            case 1:
                newArq = new File(diretorio, time + "alunos-sorted-by-name.csv");
                Collections.sort(pessoas, Comparator.comparing(Pessoa::getNome));
                escrever(newArq, pessoas);
                break;
            case 2:
                newArq = new File(diretorio, time + "alunos-sorted-by-age.csv");
                Collections.sort(pessoas, Comparator.comparing(Pessoa::getIdade));
                escrever(newArq, pessoas);
                break;
        }

        for(Pessoa p : pessoas) {
            ArquivoUtils.escrever(arquivo, p);
            System.out.println(String.format("%s tem %d", p.getNome(), p.getIdade()));
        }
    }

    private static void escrever(File arq, List<Pessoa> pessoas) throws IOException {
        for(Pessoa pessoa : pessoas) {
            ArquivoUtils.escrever(arq, pessoa);
        }
    }
}
