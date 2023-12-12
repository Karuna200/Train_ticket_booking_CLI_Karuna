import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientClass {
    BufferedReader buff;
    InputStreamReader isr;

    Socket ss;
    PrintWriter pw;
    public static void main(String[] args) throws Exception {
        ClientClass cc = new ClientClass();
        cc.ss = new Socket("127.0.0.1",8989);
        cc.isr = new InputStreamReader(cc.ss.getInputStream());
        cc.buff = new BufferedReader(cc.isr.)


    }
}
