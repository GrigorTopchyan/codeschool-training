package HomeWork13.HomeTask1;

import java.io.*;
import java.util.Arrays;

public class Files {
    public static void main(String[] args) throws IOException {
        File fileTxt = new File("D:/folder/sample.txt");
        File copyTxt = new File("D:/folder/sample_copy.txt");
        InputStream inputStream = new FileInputStream(fileTxt);
        byte [] arr = new byte[inputStream.available()];
         int a = inputStream.read(arr);
         OutputStream outputStream = new FileOutputStream(copyTxt);
         outputStream.write(arr);

        File fileJpg= new File("D:/folder/image.jpg");
        File copyJpg= new File("D:/folder/image_copy.jpg");
        InputStream inputStream1 =new FileInputStream(fileJpg);
        byte [] array = new byte[inputStream1.available()];
        long copyInArr = inputStream.read(array);
        OutputStream outputStream1 = new FileOutputStream(copyJpg);
        outputStream1.write(array);
        System.out.println(copyTxt.isAbsolute()+ "  and  " + copyJpg.isAbsolute());
        inputStream.close();
        outputStream.close();

    }
}
