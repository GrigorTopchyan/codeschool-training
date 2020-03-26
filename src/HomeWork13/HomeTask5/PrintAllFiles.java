package HomeWork13.HomeTask5;

import java.io.File;

public class PrintAllFiles extends File{
    public PrintAllFiles(String pathname) {
        super(pathname);
    }

    public static void printFiles(File path){
        File [] file = path.listFiles();
        for (File f:file
             ) {if(f.isFile()){
            System.out.println(f);
        }else if(f.isDirectory()){
                 printFiles(f);
        }

        }
    }
}
