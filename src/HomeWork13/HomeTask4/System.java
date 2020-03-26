package HomeWork13.HomeTask4;

import java.io.*;

public class System {
    public static void println(String str) throws IOException {
        File file = new File("C:\\temp\\sout.txt");
        OutputStream outputStream = new FileOutputStream(file);
        byte [] b = new byte[str.length()];
        outputStream.write(b);
    }

}
