import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Random;

public class Client {
    // user
    // sends jobs of types A and B to the master
    // different amounts in different orders

    Socket socket = new Socket("localhost", 8080); // connection with master

    public Client() throws IOException {
    }

    public static void main(String[] args) {
        /* Client class - send jobs of type a or type b
    Create a method that accepts list of jobs from the user - and then sends to master main method in client class.
    Connection with master class. */

        // Type A = 0
        // Type B = 1

        ArrayList<Integer> jobsList = new ArrayList<>();

        for (int i = 0; i <= 15; i++) // need to find out how many jobs are sent
        {
            Random random = new Random();
            int jobType = random.nextInt(0, 2);

            jobsList.add(jobType);
        }
        // send this list over to the master
    }

}