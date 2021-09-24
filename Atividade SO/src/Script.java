
import java.io.File;
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

           if (i % 100000 ==0){
               System.out.println(valor);
               arquivo.flush();
//               FileWriter arquivoTemp = new FileWriter("arquivo" + i/100000 +".txt");
//               PrintWriter gravadorTemp = new PrintWriter(arquivoTemp);
               File copiador = new File("/home/basis/Documentos/Referencia/SGE/Atividade SO/arquivo.txt");

//               gravadorTemp.println(valor);
//               arquivoTemp.close();

           }
        }


        arquivo.close();

        System.out.println("Arquvio criado");
    }
}
