import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SubProcessoMain {

    public static void main(String[] args) throws IOException {

        try {

            int numero = 1000000;
            String valor = "";
            String backup = "";

            FileWriter arquivo = new FileWriter("arquivo.txt");
            PrintWriter gravadorArquivo = new PrintWriter(arquivo);
            Path caminhoOriginal = Paths.get("./arquivo.txt");

            for (int i = 0; i <= numero; i++){

                valor = ""+i;
                gravadorArquivo.println(valor);
                String caminho = "";

                if (i % 100000 ==0 && i != 0){
                    System.out.println(valor);
                    caminho = "arquivo" + i/100000 +".txt";
                    arquivo.flush();
                    Path caminhoCopia = Paths.get("./" + caminho);
                    Files.copy(caminhoOriginal,caminhoCopia);
                }
            }
            arquivo.close();
            System.out.println(SubProcesso.execCommand("cp ./arquivo.txt ~/Downloads"));

            System.out.println("Arquvio criado");
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }



    }
}
