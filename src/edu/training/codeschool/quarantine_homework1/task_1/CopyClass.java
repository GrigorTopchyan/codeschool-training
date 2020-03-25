package edu.training.codeschool.quarantine_homework1.task_1;

import java.io.*;

public class CopyClass {
    public static void copy(FileInputStream orig, FileOutputStream copy) throws FileNotFoundException, IOException {
        int text;
        while ((text = orig.read()) !=-1){
            copy.write(text);
        }
        orig.close();
        copy.close();
        System.out.println("everything is ok");
    }
}
