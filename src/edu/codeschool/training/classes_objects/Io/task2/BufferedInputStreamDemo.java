package edu.codeschool.training.classes_objects.Io.task2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class BufferedInputStreamDemo {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = new FileInputStream("C:/File/files.txt");
       CustomBufferedInputStream bufferedInputStream = new CustomBufferedInputStream(inputStream,10);
        System.out.println((char)bufferedInputStream.read());
        System.out.println((char)bufferedInputStream.read());
        System.out.println((char)bufferedInputStream.read());
        System.out.println((char)bufferedInputStream.read());
        System.out.println((char)bufferedInputStream.read());
        System.out.println((char)bufferedInputStream.read());
        System.out.println((char)bufferedInputStream.read());
        System.out.println((char)bufferedInputStream.read());
        System.out.println((char)bufferedInputStream.read());
    }
}
