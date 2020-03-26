package HomeWork13.HomeTask3;

import java.io.*;

public class filesTry {
    public static void main(String[] args) throws IOException {
        File fileTxt = new File("D:/folder/sample.txt");
        File copyTxt = new File("D:/folder/sample_copy.txt");

        InputStream inputStream = new FileInputStream(fileTxt);

        byte[] arr = new byte[inputStream.available()];
        try {
            int a = inputStream.read(arr);
            OutputStream outputStream = new FileOutputStream(copyTxt);
            outputStream.write(arr);
        } catch (FileNotFoundException ex) {
            System.out.println("file not found" + ex);
        } finally {
            inputStream.close();
        }

        File fileJpg = new File("D:/folder/image.jpg");
        File copyJpg = new File("D:/folder/image_copy.jpg");
        InputStream inputStream1 = new FileInputStream(fileJpg);
        try {
            byte[] array = new byte[inputStream1.available()];

            long copyInArr = inputStream.read(array);
            OutputStream outputStream1 = new FileOutputStream(copyJpg);
            outputStream1.write(array);
        } catch (FileNotFoundException ex) {
            System.out.println("copy jpg file not found" + ex);
        } finally {
            inputStream1.close();
        }
        System.out.println(copyTxt.isAbsolute() + "  and  " + copyJpg.isAbsolute());


    }
}

