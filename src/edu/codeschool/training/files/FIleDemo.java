package edu.codeschool.training.files;

import java.io.*;

public class FIleDemo {
    public static void main(String[] args) throws IOException {
        File sampleOriginal = new File("C://temp/sample.txt");
        File sampleCopy = new File("C://temp/sample_copy.txt");
        try (OutputStream outputStream = new FileOutputStream(sampleCopy);
             InputStream inputStream = new FileInputStream(sampleOriginal)) {

            int a = inputStream.read();
            while (a != -1) {
                outputStream.write(a);
                a = inputStream.read();
            }
        }

        File imageOriginal = new File("C://temp/image.jpg ");
        File imageCopy = new File("C://temp/image_copy.jpg ");

        try(OutputStream outputStream = new FileOutputStream(imageCopy);
            InputStream inputStream = new FileInputStream(imageOriginal)){

            int a = inputStream.read();
            while (a != -1){
                outputStream.write(a);
                a = inputStream.read();
            }
        }




    }

}


