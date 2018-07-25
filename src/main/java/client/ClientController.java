package client;

import model.Client;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientController {

    private final String ipAddress;
    private final int port;
    private Socket socket;
    private ObjectOutputStream writer;

    public ClientController(String ipAddress, int port) {
        this.ipAddress = ipAddress;
        this.port = port;
    }

    public void start() throws IOException {
        connectToServer();
        if(signIn()){
            System.out.println("dupa");
        } else {
            System.out.println("Dupa2");
        }
    }

    public boolean signIn(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your login: ");
        String userLogin = scanner.nextLine();
        System.out.println("Please enter your password: ");
        String userPassword = scanner.nextLine();
        try {
            writer.writeObject(new Client(userLogin, userPassword).toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }

    public void connectToServer() throws IOException {
        System.out.printf("Connecting to %s:%d ... \n", ipAddress, port);
        socket = new Socket(ipAddress, port);
        writer = new ObjectOutputStream(socket.getOutputStream());

    }
}
