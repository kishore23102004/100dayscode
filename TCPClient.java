import java.net.*;
import java.io.*;

public class TCPClient {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("localhost", 9999);

        BufferedReader user = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(s.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));

        System.out.print("Enter message: ");
        String msg = user.readLine();
        out.println(msg);
        System.out.println(in.readLine());

        s.close();
    }
}
