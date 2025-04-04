import java.io.*;

public class Exercicio01 {
    public static void main(String[] args) throws IOException {
        File dir = new File("C:\\Teste");
        File ex01 = new File(dir, "numeros.txt");

        if(!ex01.exists()) {
            System.out.println("Criando arquivo...");
            var result = ex01.createNewFile();
            System.out.println(result);
        }

        FileWriter fileWriter = new FileWriter(ex01, false);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        for(int i = 1; i < 11; i++) {
            printWriter.println(String.format("Linha %d ", i));
        }
        printWriter.close();

        FileReader fileReader = new FileReader(ex01);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String linha = "**";

        while((linha = bufferedReader.readLine()) != null) {
            System.out.println(linha);
        }
    }
}
