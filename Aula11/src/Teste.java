import java.io.*;

public class Teste {
    public static void main(String[] args) throws IOException {
        System.out.println(System.getProperty("user.dir"));
        System.out.println(System.getProperty("user.home"));
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("file.separator"));

        File dir = new File("C:\\Teste");

        if (!dir.isDirectory()) {
            System.out.println("Criando diretorio...");
            var result = dir.mkdir();
            System.out.println(result);
        }

        File file = new File(dir, "teste.txt");

        if(!file.exists()) {
            System.out.println("Criando arquivo...");
            var result = file.createNewFile();
            System.out.println(result);
        }

        File all = new File("C:\\");
        for(File f : all.listFiles()) {
            if (f.isDirectory()) {
                System.out.println(f.getName() + " é um DIR");
                continue;
            }
            System.out.println(f.getName() + " é um FILE");
        }

        FileWriter fileWriter = new FileWriter(file, true);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        for(int i = 1; i < 11; i++) {
            printWriter.println(String.format("Linha %d ", i));
        }
        printWriter.close();
        System.out.println("Escrita de dados realizada com sucesso");

        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String linha = "**";

        while((linha = bufferedReader.readLine()) != null) {
            System.out.println(linha);
        }
    }
}
