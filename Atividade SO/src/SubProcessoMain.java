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
           Script.executarScript();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }



    }
}
