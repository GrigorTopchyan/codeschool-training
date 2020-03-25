package edu.training.codeschool.quarantine_homework1.task_2;

import java.io.*;

public class Creator {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File files = new File("C:\\temp\\codeschool\\java");
        if (!files.exists()) {
            if (files.mkdirs()) {
                System.out.println("Multiple directories are created!");
            } else {
                System.out.println("Failed to create multiple directories!");
            }

        }

        FileInputStream orig = new FileInputStream("C:\\Users\\Admin\\Desktop\\homework\\sample.txt");
        FileOutputStream copy = new FileOutputStream("C:\\temp\\codeschool\\java\\sample.txt");
        int text;
        while ((text = orig.read()) !=-1){
            copy.write(text);
        }
        orig.close();
        copy.close();
//        File file = new File("C:\\Users\\Admin\\Desktop\\homework\\sample.txt");
//        if (!file.exists()) {
//            System.out.println("I can't");
//
//        }else {
//            file.deleteOnExit();
//        }


    }
}
