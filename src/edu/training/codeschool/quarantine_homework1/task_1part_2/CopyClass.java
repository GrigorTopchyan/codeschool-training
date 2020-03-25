package edu.training.codeschool.quarantine_homework1.task_1part_2;

import java.io.*;

public class CopyClass {
    public static void copy(FileInputStream orig, FileOutputStream copy, File file) throws FileNotFoundException, IOException {

        byte[] buffer = new byte[(int)file.length()];
        int length;

        while ((length = orig.read(buffer)) > 0){
            copy.write(buffer, 0, length);
        }

        orig.close();
        copy.close();
        System.out.println("everything is ok");
    }
}
