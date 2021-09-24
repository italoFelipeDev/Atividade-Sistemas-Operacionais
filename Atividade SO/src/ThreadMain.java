import java.io.IOException;

public class ThreadMain {


    public static void main(String[] args){
        new Thread(t1).start();
    }

    private static Runnable t1 = new Runnable() {

        @Override
        public void run() {
            try {
                Script.executarScript();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    };
}
