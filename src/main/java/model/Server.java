package model;

import java.io.IOException;
import java.net.Socket;

public class Server {

    private String addressIP;
    private int portID;
    private Socket socket;

    public Server(String addressIP, int portID) {
        this.addressIP = addressIP;
        this.portID = portID;
    }

    private void initializeSocket(String addressIP, int portID) throws IOException {
        socket = new Socket(addressIP, portID);
    }
}
