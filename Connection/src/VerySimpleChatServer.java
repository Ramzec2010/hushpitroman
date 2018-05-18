import java.io.*;
import java.net.*;
import java.util.*;

public class VerySimpleChatServer {

    ArrayList clienOutputStreams;

    public class ClientHandler implements Runnable {
        BufferedReader reader;
        Socket sock;

        public ClientHandler(Socket clientSocket) {
            try {
                sock = clientSocket;
                InputStreamReader isReader = new InputStreamReader(sock.getInputStream());
                reader = new BufferedReader(isReader);

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        @Override
        public void run() {
            String message;
            try {
                while((message = reader.readLine()) != null) {
                    System.out.println("read " + message);
                    tellEveryone(message);
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new VerySimpleChatServer().go();
    }

    public void go() {
        clienOutputStreams = new ArrayList();
        try{
            ServerSocket serverSocket = new ServerSocket(5000);

            while(true) {
                Socket clientSOcket = serverSocket.accept();
                PrintWriter writer = new PrintWriter(clientSOcket.getOutputStream());
                clienOutputStreams.add(writer);

                Thread t = new Thread(new ClientHandler(clientSOcket));
                t.start();
                System.out.println("got a conection");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void tellEveryone (String message) {

        Iterator it = clienOutputStreams.iterator();
        while (it.hasNext()){
            try {
                PrintWriter writer = (PrintWriter) it.next();
                writer.println(message);
                writer.flush();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

}
