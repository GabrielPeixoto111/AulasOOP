import com.sun.security.jgss.GSSUtil;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        private static final String separador = ";";

        Scanner scanner = new Scanner(System.in);
        int op;
        do {
            System.out.println("### MENU ###");
            System.out.println("1 - Cadastrar Livros");
            System.out.println("0 - Sair");
            System.out.print("Digite a sua opção");
            op = scanner.nextInt();
            if(op != 0) {
                break;
            }
        } while(op != 0);
    }

    private static Livro criarNovoLivro(Scanner scanner) {
        Livro livro = new Livro();
        System.out.print("ISBN: ");
        livro.setISBN(scanner.nextLong());
        System.out.print("Titulo: ");
        livro.setTitulo(scanner.nextLine());
        System.out.print("Autor: ");
        livro.setAutor(scanner.nextLine());
        System.out.print("Gênero: ");
        livro.setGenero(scanner.nextLine());
        System.out.print("Número de páginas: ");
        livro.setNumPaginas(scanner.nextInt());
        scanner.nextLine();
        return livro;
    }

    private static void cadastrarLivros(Livro livro) throws IOException {
        File dir = new File("C:\\Livros");
        if(!dir.exists()) {
            dir.mkdir();
        }

        File arq = new File(dir, "informacoes.txt")
        if(!arq.exists()) {
            arq.createNewFile();
        }

        FileWriter fw = new FileWriter(arq, true);
        PrintWriter pw = new PrintWriter(fw);

        System.out.println(System.lineSeparator());

        pw.write(livro.getISBN().toString());
        pw.write(System.lineSeparator());
        pw.write(livro.getTitulo());
        pw.write(System.lineSeparator());
        pw.write(livro.getAutor());
        pw.write(System.lineSeparator());
        pw.write(livro.getGenero());
        pw.write(System.lineSeparator());
        pw.write(livro.getNumPaginas().toString());
    }
}


