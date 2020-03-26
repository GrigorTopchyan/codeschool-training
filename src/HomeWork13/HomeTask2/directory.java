package HomeWork13.HomeTask2;

import com.sun.corba.se.spi.orbutil.fsm.FSMImpl;

import java.io.*;
import java.util.Arrays;

public class directory {
    public static void main(String[] args) throws IOException {
        File dir = new File("C:/temp/codeSchool/java");
        dir.mkdirs();
        File file = new File("C:/temp/codeSchool/java/sample_copy.txt");
        file.createNewFile();
        File sample = new File("D:\\folder\\sample.txt");
        System.out.println(" file simple is absolute "+sample.isAbsolute());
        InputStream inputStream = new FileInputStream(sample);
        byte [] a =  new byte[inputStream.available()];
        inputStream.read(a);
        OutputStream outputStream = new FileOutputStream(file);
        outputStream.write(a);
        sample.deleteOnExit();
        File sample2 = new File("C:/temp/codeSchool/java/sample2.txt");
        sample2.createNewFile();
        InputStream input = new FileInputStream(file);
        byte [] c = new byte[input.available()];
        input.skip(10);
        input.read(c);
        OutputStream output = new FileOutputStream(sample2);
        output.write(c);

    }
}
