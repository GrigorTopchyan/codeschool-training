package edu.codeschool.training.files;

import java.io.*;
import java.lang.System;
public class WriteAll {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:/Program Files");
        WriteAll.printAll(file);
    }
    public static void printAll(File file) throws FileNotFoundException {
        File [] files = file.listFiles();
        if (file.isFile()){
            System.out.println(file.getName());
        }else if (file.isDirectory()){
            if (files == null){
                return;
            }
            for (File value : files) {
                printAll(value);
            }
        }
        }
    }


