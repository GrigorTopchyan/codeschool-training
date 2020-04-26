package edu.codeschool.training.files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class System {
    public static void main(String[] args) throws IOException {
        System.println("sadksadn");
       System.println(" jjjjj");
    }

    public static void print(String massage) throws IOException {
        FileWriter sysFile = new FileWriter("C://temp/sout.txt",true);
        sysFile.write(massage);
        sysFile.close();


    }
    public static void println(String massage) throws IOException {
        FileWriter sysFile = new FileWriter("C://temp/sout.txt",true);
        sysFile.write(massage + "\n");
        sysFile.close();

    }
}
