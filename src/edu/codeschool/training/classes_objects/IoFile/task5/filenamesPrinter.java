package edu.codeschool.training.classes_objects.IoFile.task5;

import java.io.File;

public class filenamesPrinter {
    public static void main(String[] args) {
        File file = new File("C:/Program Files");
        printFilesInDirectory(file);
    }

    private static void printFilesInDirectory(File file) {
        if (file.isFile()) {
            System.out.println(file.getName());
            return;
        } else {
            File[] files = file.listFiles();
            if (files == null) return;
            for (int i = 0; i < files.length; i++) {
                printFilesInDirectory(files[i]);
            }
        }
    }
}
