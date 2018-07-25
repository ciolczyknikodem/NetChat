package client;

import model.Client;
import model.Message;

import java.io.*;
import java.net.Socket;
import java.net.SocketException;
import java.util.Scanner;

public class ChatSender {

    private Socket socket;
    private ObjectOutputStream writer;
    private Client client;

    public ChatSender(Socket socket, Client client) {
        this.client = client;
        this.socket = socket;
    }

    public void runSender() throws IOException {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            Message message = new Message(scanner.nextLine(), client.getName());
            try {
                writer.writeObject(message);
            } catch (SocketException e) {
                System.err.println("The server is not responding, closing ...");
                break;
            }
        }
    }
}
