package edu.training.codeschool.quarantine_homework1.task_2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Creator2 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileInputStream orig1 = new FileInputStream("C:\\Users\\Admin\\Desktop\\homework\\sample.txt");
        FileOutputStream copy1 = new FileOutputStream("C:\\temp\\codeschool\\java\\sample.txt");
        int text;
        orig1.skip(10);
        while ((text = orig1.read()) !=-1){
            copy1.write(text);
        }
        orig1.close();
        copy1.close();
    }
}
