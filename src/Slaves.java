import java.io.IOException;
import java.net.ServerSocket;

public class Slaves {
    // hi this is to make the update work
    // 2 back ends
    // as master gets new job, check which time until free is shorter

    public class SlaveA
    {
        // variables timeUntilFree
        // TIME A = 2
        // TIME B = 10
        // doJobA() sleep(2) timeUntilFree -= 2

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