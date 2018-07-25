package client;

import model.Client;
import model.Message;

import java.io.*;
import java.net.SocketException;
import java.util.List;
import java.util.Scanner;

public class ChatSender {

    private ObjectOutputStream writer;
    private Client client;
    private List<Client> userList;

    public ChatSender(ObjectOutputStream writer, Client client, List<Client> userList) {
        this.client = client;
        this.writer = writer;
        this.userList = userList;
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
