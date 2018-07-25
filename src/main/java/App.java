import client.ClientController;
import serverlogic.Server;

import java.io.IOException;

public class App {

    public static void main(String[] args) throws IOException {
        try {
            String typeOfUser = args[0];

            if (typeOfUser.equalsIgnoreCase("server")) {
                int port = Integer.valueOf(args[1]);
                new Server(port).startListening();
            } else if(typeOfUser.equalsIgnoreCase("client")){
                String ipAddress = args[1];
                int port = Integer.valueOf(args[2]);
                new ClientController(ipAddress, port).start();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Please enter correct arguments!");
        }
    }
}
