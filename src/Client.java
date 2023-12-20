import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Random;

public class Client {
    // user
    // sends jobs of types A and B to the master
    // different amounts in different orders

    public Client() throws IOException {
    }

    public static void main(String[] args) throws IOException {
        /* Client class - send jobs of type a or type b
        Create a method that accepts list of jobs from the user - and then sends to master main method in client class.
        Connection with master class. */

        try
        {
            Socket clientSocket = new Socket("localhost", 8080); // connection with master


            // Type A = 0
            // Type B = 1


            ArrayList<Integer> jobList = new ArrayList<>();

            for (int i = 0; i <= 15; i++) // need to find out how many jobs are sent
            {
                Random random = new Random();
                int jobType = random.nextInt(0, 2);
                jobList.add(jobType);
            }

            // send this list (jobList) over to the master - using reader/ writer

            /*BufferedReader responseReader = // stream to read text response from server
                    new BufferedReader(
                            new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter requestWriter = // stream to write text requests to server
                    new PrintWriter(clientSocket.getOutputStream(), true);*/

        }

        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}