package ir.maktab56.home_work14.chat;

import java.io.*;
import java.net.Socket;

public class SimpleClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 1234);

        InputStream ins = socket.getInputStream();

        DataInputStream dis = new DataInputStream(ins);
        OutputStream output = socket.getOutputStream();
        DataOutputStream dos = new DataOutputStream(output);
        String str = new String(dis.readUTF());
        System.out.println(str);

        socket.close();
    }

}
