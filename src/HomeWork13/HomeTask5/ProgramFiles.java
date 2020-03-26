package HomeWork13.HomeTask5;

import java.io.File;
import java.util.Arrays;

public class ProgramFiles {
    public static void main(String[] args) {
        File file = new File("C:\\Program Files");
        System.out.println(file.isAbsolute());
        File[] files = file.listFiles();
        for (File f:files
             ) { if(f.isDirectory()){

        }

        }
      /*  ;
        for (int i = 0; i < files.length; i++) {
            for (int j = 0; j < files.length; j++) {
                if (files[i].isDirectory()) {
                    File dir = new File(files[i].getParent());
                    File[] arr = dir.listFiles();
                    System.out.println(arr[j].getName());
                } else {
                    System.out.println(files[i]);
                }
            }

            *//*} else if (files[i].isDirectory()) {
                     File dir = new File(files[i].getParent());
                File[] arr = dir.listFiles();
                for (File f1:arr)
                {if (file.isFile()){
                    System.out.println(f1);
                }else {

                }*//*

        }
    }*/


    }
}