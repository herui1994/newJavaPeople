import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Adaptor {
    public static void main(String[] args) throws Exception{
        char[] cbuf = new char[256];
        System.out.println("hey, may I have your name, please? ");
        int n = 0;
        Reader r = new InputStreamReader(System.in);
        try {
            n = r.read(cbuf);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("hello, Mr. " + cbuf[0] + " ===  " + n);
    }
}
