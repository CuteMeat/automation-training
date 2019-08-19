package com.task.automation.jio.optional;

import java.io.*;
import java.util.ArrayList;


public class SecondTask {
    public static void main(String[] args) {
        File dir = new File ("data/secondTask");
        dir.mkdirs();
        File outPutFile = new File(dir+"/outPut.txt");

        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outPutFile));
        BufferedReader bufferedReader = new BufferedReader(new FileReader("src/main/java/com/task/automation/" +
                "jio/optional/SecondTask.java"))) {
            ArrayList<String> array = new ArrayList<String>();
            String tmpString = null;
            while ((tmpString = bufferedReader.readLine())!=null) {
                StringBuilder result = new StringBuilder();
                result.append(tmpString).reverse();
                bufferedWriter.write(result.toString());
                bufferedWriter.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}