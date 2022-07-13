import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Main {

    private static Socket clientSocket;
    private static PrintWriter out;
    private static BufferedReader in;

    public static void main(String[] args) throws IOException {
        String host = "localhost";
        int port = 8080;
        try{
                clientSocket = new Socket(host,port);
                out = new PrintWriter(clientSocket.getOutputStream(),true);
                in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            out.println("Shamil");
            String resp = in.readLine();
            System.out.println(resp);
        }finally {
            clientSocket.close();
            in.close();
            out.close();
        }
    }
}
