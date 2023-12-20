import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Stack;

public class Master {
    // front end
    // schedule incoming jobs to A or B
    // figure out which slave should do which job
    // based on what other jobs the slaves are doing currently

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8080); // connection with client
        System.out.println("Waiting for connection to Client");

        // connect it to client socket
        Socket connectToClientSocket = serverSocket.accept();
        System.out.println("Connection to Client established");
        System.out.println();

        while (true)
        {

            /* Master class: store in a stack and peek then make a condition - if a lot more of its own type
            Create a count of jobs
            Each time a job comes in multiply a jobs times 2 also multiply
            If the time of A is greater than b by 10 seconds then add to B
            If adding 10 seconds will make the time of B greater than the time of A when we add two seconds,
            send to A. (for Job) if else send to B.
            Master counts seconds and removes. This can be in a remove job method. */


            Stack<Integer> jobTypeA = new Stack<>();
            Stack<Integer> jobTypeB = new Stack<>();
            // maybe put stacks in slaves class?
            // figure out the structure

            int counterA = 0;
            int counterB = 0;

            //ArrayList<Integer> jobsList = get the jobList from Client using the reader (whatever you Google)
            // index can be the jobs IDs


            /*for (int i = 0; i < jobsList.length; i++)
            {
            //For each job, see which type slave it is
            //if that slave is busy, send to other type for 10 seconds
            //if that slave is not busy, send to own slave for 2
                if (jobsList(i) == 0)
                {

                    jobTypeA.push(jobsList(i)); // get As from client
                    counterA++;
                }
                else if (jobsList(i) == 1)
                {
                    jobTypeB.push(jobsList(i)); // get Bs from client
                    counterB++;
                }

            }*/

            // send to client when job completes


        }
    }
}