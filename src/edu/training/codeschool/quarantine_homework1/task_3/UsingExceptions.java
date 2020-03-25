package edu.training.codeschool.quarantine_homework1.task_3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class UsingExceptions {
    public static void main(String[] args) {
        FileInputStream orig1 = null;
        FileOutputStream copy1 = null;
        try {
            orig1 = new FileInputStream("C:\\Users\\Admin\\Desktop\\homework\\sample.txt");
            copy1 = new FileOutputStream("C:\\temp\\codeschool\\java\\sample.txt");
            int text;
            orig1.skip(10);
            while ((text = orig1.read()) != -1) {
                copy1.write(text);
            }
        } catch (FileNotFoundException ex) {
            ex.getCause();
        } catch (IOException e) {
            e.getCause();
        } finally {
            try {
                orig1.close();
                copy1.close();
            } catch (IOException e) {
                e.getCause();
            }


        }
    }
}
