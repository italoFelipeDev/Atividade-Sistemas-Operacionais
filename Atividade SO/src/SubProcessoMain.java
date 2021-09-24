import java.io.IOException;

public class SubProcessoMain {

    public static void main(String[] args) throws IOException {

        try {
           Script.executarScript();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }



    }
}
