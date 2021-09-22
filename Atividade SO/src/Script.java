

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Script {
    public static void main(String[] args) throws IOException {

        int numero = 1000000;
        String valor = "";
        String backup = "";

        FileWriter arquivo = new FileWriter("arquivo.txt");
        PrintWriter gravadorArquivo = new PrintWriter(arquivo);

        for (int i = 0; i <= numero; i++){

           valor = ""+i;
           gravadorArquivo.println(valor);

           if (i % 100000 ==0 && i != 0){
               System.out.println(valor);
               arquivo.flush();
               File arquivoTemp = new File("arquivo" + i/100000 +".txt");
               PrintWriter gravadorTemp = new PrintWriter(arquivoTemp);
               FileInputStream copiador = new FileInputStream("./arquivo.txt");
               FileOutputStream recebedor = new FileOutputStream(arquivoTemp);
               int linha;

               while ((linha = copiador.read()) != -1) {
                   recebedor.write(linha);
               }

           }
        }


        arquivo.close();

        System.out.println("Arquvio criado");
    }
}
