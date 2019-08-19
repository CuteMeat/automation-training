package com.task.automation.jio.optional;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class FirstOptional {
    public static void main(String[] args) {
        File dir = new File ("data/firstTask");
        dir.mkdirs();
        File file = new File(dir+"/inPut.txt");
        File outPutFile = new File(dir+"/outPut.txt");
        try {
            file.createNewFile();
            outPutFile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        ArrayList<Integer> array = new ArrayList<Integer>();

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            for (int i = 0; i<5; i++) {
                bufferedWriter.write(Integer.toString((int)(Math.random()*100)));
                bufferedWriter.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outPutFile))) {
            String tmpString = null;
            while ((tmpString = bufferedReader.readLine())!=null) {
                array.add(Integer.parseInt(tmpString));
            }

            Collections.sort(array);

            for (Integer elem:array) {
                bufferedWriter.write(Integer.toString(elem) + "\t");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}