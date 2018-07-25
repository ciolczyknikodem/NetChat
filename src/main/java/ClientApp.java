import client.ClientController;

import java.io.IOException;

public class ClientApp {

    public static void main(String[] args) throws IOException {
        try{
            String ipAddress = "192.168.11.70"; //Adam IPAddress = 192.168.11.70
                                        //Augustyn IPAddress = 192.168.10.114
                                        //Nikodem IPAddress =
            int port = 9000;
            new ClientController(ipAddress, port).start();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Please enter correct arguments!");
        }
    }
}
