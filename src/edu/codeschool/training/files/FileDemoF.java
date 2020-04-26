package edu.codeschool.training.files;

import java.io.File;
import java.io.IOException;
import java.lang.System;

public class FileDemoF {
    public static void main(String[] args) throws IOException {
        File directory = new File("C:/java/resources/files");
        directory.mkdirs();

        File file1 = new File(directory,"file1.txt");
        File file2 = new File("C:/java/resources/files/file2.txt");
        File file3 = new File("C:/java/resources/files","file3.txt");
        file1.createNewFile();
        file2.createNewFile();
        file3.createNewFile();

        System.out.println(file1.canExecute());
        System.out.println(file1.canRead());
        System.out.println(file1.canWrite());
        System.out.println(file2.compareTo(file1));
        System.out.println(File.createTempFile("file5.txt",""));
        System.out.println(file3.delete());
        System.out.println(file2.equals(file1));
        System.out.println(file1.exists());
        System.out.println(file1.getAbsolutePath());
        System.out.println(file2.getFreeSpace());
        System.out.println(file1.getName());
        System.out.println(file1.getParent());
        System.out.println(file1.getParentFile());
        System.out.println(file1.getPath());
        System.out.println(file1.isDirectory());
        System.out.println(file2.isFile());
        System.out.println(file1.isHidden());
        System.out.println(file2.length());
        System.out.println(file1.list());
        System.out.println(file2.listFiles());
        System.out.println(file1.mkdir());
        System.out.println(file2.renameTo(file1));
        System.out.println(file1.setExecutable(true));
        System.out.println(file2.setReadable(true));
        System.out.println(file1.setReadOnly());
        System.out.println(file2.setWritable(true));
        System.out.println(file1.toString());
        


    }
}
