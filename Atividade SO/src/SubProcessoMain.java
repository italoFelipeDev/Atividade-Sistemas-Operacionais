import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class SubProcessoMain {

    public static void main(String[] args) throws IOException {

        try {

            int numero = 1000000;
            String valor = "";
            String backup = "";

            FileWriter arquivo = new FileWriter("arquivo.txt");
            PrintWriter gravadorArquivo = new PrintWriter(arquivo);

            for (int i = 0; i <= numero; i++){

                valor = ""+i;
                gravadorArquivo.println(valor);
                String caminho = "";

                if (i % 100000 ==0){
                    System.out.println(valor);
                    arquivo.flush();
                    caminho = "arquivo" + i/100000 +".txt";
                    FileWriter arquivoTemp = new FileWriter(caminho);
                    arquivo.close();
                    String[] b = new String[] {"bash", "-c", "cp -R \"" + "arquivo.txt" + "/\"* \"" + "./" + caminho + "/\""};
                    Runtime.getRuntime().exec(b);

//                    PrintWriter gravadorTemp = new PrintWriter(arquivoTemp);
//                    File copiador = new File("/home/basis/Documentos/Referencia/SGE/Atividade SO/arquivo.txt");
//
//                    gravadorTemp.println(valor);
//                    arquivoTemp.close();


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
