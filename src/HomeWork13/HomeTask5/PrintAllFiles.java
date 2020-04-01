package HomeWork13.HomeTask5;

import java.io.File;

public class PrintAllFiles {
    public static void main(String[] args) {
        File file = new File("C:\\Program Files");
        PrintFilesName(file);
    }
    public static void PrintFilesName(File file) {
        if (file.isFile()) {
            System.out.println(file.getName());
            return;
        } else if (file.isDirectory()) {
            File[] files = file.listFiles();
            if (files == null)return;
            for (File f : files)
            { PrintFilesName(f);

            }
        }
    }
}
