package edu.codeschool.training.classes_objects.IoFile.task1;

import java.io.*;

public class CopiFile {
    public static void main(String[] args) throws IOException {

        File file = new File("C:/File/image.jpg");
        File copy = new File("C:/File/copy/image.jpg");

        try (OutputStream outputStream = new FileOutputStream(copy)) {
            InputStream inputStream = new FileInputStream(file);
            int a = inputStream.read();
            while (a != -1) {
                outputStream.write(a);
                a = inputStream.read();
            }
        }
        File file1 = new File("C:/File/sample.txt");
        File copy1 = new File("C:/File/copy/sample.txt");
        try (OutputStream outputStream = new FileOutputStream(copy1)) {
            InputStream inputStream = new FileInputStream(file1);
            int a = inputStream.read();
            while (a != -1) {
                outputStream.write(a);
                a = inputStream.read();

            }
        }
    }
}