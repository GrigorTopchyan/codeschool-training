package edu.training.codeschool.quarantine_homework1.task_4;

import java.io.FileWriter;
import java.io.IOException;

public class System {
    public static void print(String input) {
        try {
            FileWriter writer = new FileWriter("C:\\Users\\Admin\\Desktop\\homework\\myFile.txt", true);
            writer.write(input);

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void println(String input) {
        try {
            FileWriter writer = new FileWriter("C:\\Users\\Admin\\Desktop\\homework\\myFile1.txt", true);
            writer.write(input+"\n");

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
      System.println("sada");
      System.println("sada");

    }
}
