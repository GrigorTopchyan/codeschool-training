package edu.codeschool.training.files;

import java.io.*;

public class DirectoryDemo {
    public static void main(String[] args) throws IOException {
        File codeschoolDirectory = new File("C:/temp/codeschool/java");
        codeschoolDirectory.mkdir();

        File sampleOriginal = new File("C://temp/sample.txt");
        File sampleCopy = new File("C://temp/codeschool/java/sample_copy.txt");
        sampleCopy.createNewFile();
        try (OutputStream outputStream = new FileOutputStream(sampleCopy);
             InputStream inputStream = new FileInputStream(sampleOriginal)) {

            int a = inputStream.read();
            while (a != -1) {
                outputStream.write(a);
                a = inputStream.read();
            }
        }
        sampleOriginal.deleteOnExit();
        File anotherFile = new File("C://temp/codeschool/java/anotherFile.txt");
        anotherFile.createNewFile();
        try (OutputStream outputStream = new FileOutputStream(anotherFile);
             InputStream inputStream = new FileInputStream(sampleOriginal)) {

            inputStream.skip(10);
            int a = inputStream.read();
            while (a != -1) {
                outputStream.write(a);
                a = inputStream.read();
            }

        }
    }
}
