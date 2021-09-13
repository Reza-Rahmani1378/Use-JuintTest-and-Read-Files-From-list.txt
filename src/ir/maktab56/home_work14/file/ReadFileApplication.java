package ir.maktab56.home_work14.file;

import java.io.IOException;
import java.io.RandomAccessFile;

public class ReadFileApplication{
    private static final String textFile = "List.txt";
    public static void main(String[] args) throws IOException {
            useRandomAccessFileRead();

    }



    private static void useRandomAccessFileRead() throws IOException {
        RandomAccessFile file = new RandomAccessFile(textFile , "r");

        while (file.getFilePointer() < file.length()) {
            System.out.println(
                    file.readLine()
            );
        }
    }

}
