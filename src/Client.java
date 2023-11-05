import java.io.IOException;
import java.net.Socket;

public class Client {
    // user
    // sends jobs of types A and B to the master
    // different amounts in different orders
    // figure out which slave should do which job
    // based on what other jobs the slaves are doing currently
    Socket socket = new Socket("localhost", 8080);

    public Client() throws IOException {
    }
}