package edu.training.codeschool.quarantine_homework1.task_1part_2;
import java.io.*;

public class CopyClassTest {
    public static void main(String[] args) throws FileNotFoundException, IOException {

        FileInputStream orig = new FileInputStream("C:\\Users\\Admin\\Desktop\\homework\\sample.txt");
        FileOutputStream copy = new FileOutputStream("C:\\Users\\Admin\\Desktop\\homework\\sample_copy.txt");
        File file = new File("C:\\Users\\Admin\\Desktop\\homework\\sample.txt");
        FileInputStream orig_pic = new FileInputStream("C:\\Users\\Admin\\Desktop\\homework\\image.jpg");
        FileOutputStream copy_pic = new FileOutputStream("C:\\Users\\Admin\\Desktop\\homework\\image_copy.jpg");
        CopyClass.copy(orig,copy, file);
        CopyClass.copy(orig_pic, copy_pic, file);
    }
}
