package net;

import java.io.IOException;
import java.net.Socket;

public class clientTest {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("127.0.0.1", 25565);
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
