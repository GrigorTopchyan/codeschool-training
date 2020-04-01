package HomeWork13.HomeTask3;

import java.io.*;

public class directoryTry {
    public static void main(String[] args) throws IOException {
        File dir = new File("C:/temp/codeSchool/java");


        dir.mkdirs();

        File file = new File("C:/temp/codeSchool/java/sample_copy.txt");
        file.createNewFile();
        File sample = new File("D:\\folder\\sample.txt");
        System.out.println(" file simple is absolute " + sample.isAbsolute());


        InputStream inputStream = new FileInputStream(sample);
        try {
            byte[] a = new byte[inputStream.available()];
            inputStream.read(a);
            OutputStream outputStream = new FileOutputStream(file);
            outputStream.write(a);
        } catch (IOException ex) {
            System.out.println("IO exception " + ex);
        } finally {
            inputStream.close();
        }
        sample.deleteOnExit();
        File sample2 = new File("C:/temp/codeSchool/java/sample2.txt");
        sample2.createNewFile();

        InputStream input = new FileInputStream(file);
        try {
            byte[] c = new byte[input.available()];
            input.skip(10);
            input.read(c);
            OutputStream output = new FileOutputStream(sample2);
            output.write(c);
        } catch (FileNotFoundException ex) {
            System.out.println("file not found" + ex);
        } finally {
            input.close();

        }

    }
}
