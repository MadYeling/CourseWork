package net;

import java.io.IOException;
import java.net.ServerSocket;

public class serveTest {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(25565);
            ss.accept();
            System.out.println("Minecraft!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
