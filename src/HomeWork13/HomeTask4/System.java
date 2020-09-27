package HomeWork13.HomeTask4;

import java.io.*;
import java.util.zip.InflaterInputStream;

public class System {
    public static void println(String str) throws IOException {
        FileWriter writer = new FileWriter("C:/temp/sout.txt",true);
        writer.write(str);
        writer.close();

    }
    public static void print(String str) throws IOException {
        FileWriter writer = new FileWriter("C:/temp/sout.txt",true);
        writer.write(str+"\n");
        writer.close();


    }

    public static void main(String[] args) throws IOException {
        System.println("aaaaa");
        System.println("bbbbb");
        System.print("ccc");
        System.print("ddd");

    }

}
