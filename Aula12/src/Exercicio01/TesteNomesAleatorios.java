package Exercicio01;

import Exercicio01.ArquivoUtils;
import Exercicio01.GerarDadosAleatorios;
import Exercicio01.Pessoa;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TesteNomesAleatorios {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        File diretorio = new File("C:\\positivo");
        File arquivo = new File(diretorio, "sistema-alunos.csv");

        var resultadoDir = ArquivoUtils.criarDiretorio(diretorio);
        System.out.println("Diretorio foi criado? " + resultadoDir);

        var resultadoArq = ArquivoUtils.criarArquivo(arquivo);
        System.out.println("Arquivo foi criado? " + resultadoArq);

        System.out.println("Necessário definir o número de alunos a serem criados:");
        System.out.println("Informe a quantidade de alunos: ");
        var qtd = scanner.nextInt();

        for(int i = 0; i < qtd; i++) {
            var idade = GerarDadosAleatorios.gerarIdade();
            var nome = GerarDadosAleatorios.gerarNomeCompleto();

            var pessoa = new Pessoa(nome, idade);

            ArquivoUtils.escrever(arquivo, pessoa);
        }
    }
}
