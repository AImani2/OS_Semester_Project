import java.io.IOException;
import java.net.ServerSocket;
import java.util.ArrayList;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.ArrayList;

public class SlaveB {
    /* Slaves class:
    These are the backend classes and as the master gets a job it will check the slaves jobs
    Accepts the jobs from the master and can return done when done.
    When a slave receives a job, it should
    “work” on it by sleeping. When the slave is finished, it alerts the master that the job is complete, and the
    master alerts the correct client that the job is complete
    */

    // 2 back ends
    // as master gets new job, check which time until free is shorter

    ServerSocket serverSocket = new ServerSocket(8080);

    // read job from master
    // if jobA goes to slaveA or jobB goes to slaveB call ownJobType()

    public void ownJobType() {
        Thread ownJobType = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                    // depends which job type it's doing gonna sleep for different amounts of time
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        ownJobType.run();
    }

    public void otherJobType() {
        Thread otherJobType = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(10000);
                    // depends which job type it's doing gonna sleep for different amounts of time
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        otherJobType.run();

        // send to master that job complete
    }

    public SlaveB() throws IOException {
    }
}