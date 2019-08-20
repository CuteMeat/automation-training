package com.task.automation.jio.main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MainTask {
    public static ArrayList<String> list = new ArrayList<String>();
    public static StringBuilder result = new StringBuilder();
    public static void main( String[] args ) {
        String dir = "E:\\test";
        //Scanner in = new Scanner(System.in);
        //dir = in.nextLine();
        File file = new File(dir);
        File dir1 = new File ("data/mainTask");
        dir1.mkdirs();
        File outPutFile = new File(dir1+"/outPut.txt");

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outPutFile))){
            StringBuilder result = new StringBuilder();

            for (File item: file.listFiles()) {
                if(item.isDirectory()) {
                    result.append(item.getAbsolutePath()).append("\n");
                    createList(result, item.getAbsolutePath());
                }
                else result.append("|").append(item.getAbsolutePath()).append("\n");
            }
//
            bufferedWriter.write(result.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void createList (StringBuilder result, String dir) {
        File dir1 = new File(dir) ;
        result.append("\t");
        if (dir1.isDirectory()) {
            for (File item:dir1.listFiles()) {
                result.append("\t");
                if (item.isDirectory()) {
                    result.append(item.getAbsolutePath()).append("\n");
                    createList(result, item.getAbsolutePath());
                }
                else result.append("\t|").append(item.getAbsolutePath()).append("\n");
            }
        }
        else {
            result.append("\t|").append(dir1.getAbsolutePath()).append("\n");
        }

    }
}
