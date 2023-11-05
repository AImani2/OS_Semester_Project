import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Master {
    // front end
    // schedule incoming jobs to A or B

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8080);
        while (true)
        {
            Socket socket = serverSocket.accept();
        }
    }

}