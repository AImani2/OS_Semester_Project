import java.io.IOException;
import java.net.ServerSocket;

public class Slaves {
    /* Slaves class:
    These are the backend classes and as the master gets a job it will check the slaves jobs
    Accepts the jobs from the master and can return done when done.
    When a slave receives a job, it should
    “work” on it by sleeping. When the slave is finished, it alerts the master that the job is complete, and the
    master alerts the correct client that the job is complete
    */

    // 2 back ends
    // as master gets new job, check which time until free is shorter

    public class SlaveA extends Thread
    {
        // variables timeUntilFree
        final int timeA = 2;
        final int timeB = 10;
        // doJobA() sleep(2) timeUntilFree -= 2

        public void doJobA()
        {
            Thread jobA = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                        }
                    }
            });
            jobA.run();
            //Thread.sleep(2000);
        }


        ServerSocket serverSocket = new ServerSocket(8080);

        public SlaveA() throws IOException
        {
        }
    }

    public class slaveB
    {
        // variables timeUntilFree
        // TIME A = 2
        // TIME B = 10

    }
}