import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class stub {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        // The order these are opened is very important. It must match
        // the manager.
        FileInputStream in = new FileInputStream(args[0]);
        FileOutputStream out = new FileOutputStream(args[1]);
        int procid = Integer.parseInt(args[2]);

        PrintWriter writer = new PrintWriter(out, true);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0)
                break;
            if (procid == 0)
                writer.println("correct " + user1.userfunc1(n));
            else
                writer.println("correct " + user2.userfunc2(n));
        }
    }
}
