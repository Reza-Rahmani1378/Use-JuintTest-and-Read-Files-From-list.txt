package ir.maktab56.home_work14.chat;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(1234);

        Socket socket = serverSocket.accept();

        OutputStream output = socket.getOutputStream();
        InputStream ins = socket.getInputStream();
        DataInputStream din = new DataInputStream(ins);
        DataOutputStream dos = new DataOutputStream(output);
        String messageClient = din.readUTF();

        socket.close();

    }
}
