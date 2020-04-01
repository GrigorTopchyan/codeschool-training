package HomeWork14.HomeTask1;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        File dir = new File("C:/java/resources/files/");
         if (!dir.exists()){
             dir.mkdirs();
         }
         File file1 = new File(dir,"file1.txt");
         File file2 = new File ("C:/java/resources/files/file2.txt");
         File file3 = new File("C:/java/resources/files/","file3.txt");
         file1.createNewFile();
         file2.createNewFile();
         file3.createNewFile();
        System.out.println(file1.canRead());
        System.out.println(file2.canWrite());
        int compareTo = file1.compareTo(file2);
        System.out.println(compareTo);
        System.out.println(""+file3.delete());
        System.out.println("equals "+file1.equals(file2));
        System.out.println("exists"+ file2.exists() );
        System.out.println("AbsolutePath "+file1.getAbsolutePath());
        long a = file1.getFreeSpace();
        System.out.println(a);
        System.out.println(file2.getPath());
        System.out.println("Hidden"+file1.isHidden());
        String [] str = file1.list();
        System.out.println(str);
        System.out.println(file1.renameTo(file2));



    }
}
