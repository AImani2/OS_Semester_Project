import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
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

        while (true)
        {

            /* Master class: store in a stack and peek then make a condition - if a lot more of its own type
            Create a count of jobs
            Each time a job comes in multiply a jobs times 2 also multiply
            If the time of A is greater than b by 10 seconds then add to B
            If adding 10 seconds will make the time of B greater than the time of A when we add two seconds,
            send to A. (for Job) if else send to B.
            Master counts seconds and removes. This can be in a remove job method. */

            int counterA = 0;
            int counterB = 0;

            // ArrayList<Integer> jobsList get the jobList from Client using the reader (whatever you Google)
            BufferedReader responseReader = // stream to read text response from server
                    new BufferedReader(
                            new InputStreamReader(connectToClientSocket.getInputStream()));
            String jobs = responseReader.readLine();
            String [] jobList = jobs.split("");
            // index can be the jobs IDs


            for (int i = 0; i < jobList.length; i++)
            {
            //For each job, see which type it is
            //if that slave is busy, send to other type for 10 seconds
            //if that slave is not busy, send to own slave for 2
                if (jobList[i].equals("0")) // type A
                {
                    if (counterA + 2 <= counterB + 10)
                    {
                        // send to slave A
                        counterA+=2;
                    }
                    else
                    {
                        // send to slave B
                        counterB+=10;
                    }

                }
                else if (jobList[i].equals("1")) // type B
                {
                    if (counterB + 2 <= counterA + 10)
                    {
                        // send to slave B
                        counterB+=2;
                    }
                    else
                    {
                        // send to slave A
                        counterA+=10;
                    }


                }

            }

            // send to client when job completes

            /* in each class listen out for jobs. when a job comes in, run an if statement determining whether to call own job or other job and sleep accordingly.
                communicate with master once finished sleeping and deduct counter time and job from joblist that is in master
            can remove job from list once you send it over already. */

        }
    }
}