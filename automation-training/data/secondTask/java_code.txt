package com.task.automation.jio.optional;

import java.io.*;
import java.util.ArrayList;


public class SecondTask {
    public static void main(String[] args) {
        File dir = new File ("data/secondTask");
        dir.mkdirs();
        File file = new File(dir+"/java_code.txt");

        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
        BufferedReader bufferedReader = new BufferedReader(new FileReader("src/main/java/com/task/automation/" +
                "jio/optional/SecondTask.java"))) {
            ArrayList<String> javaCode = new ArrayList<String>();
            String tmpString = null;
            while((tmpString = bufferedReader.readLine()) != null) {
                javaCode.add(tmpString);
            }

            for (String javaCodeLine:javaCode) {
                bufferedWriter.write(javaCodeLine);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        File outPutFile = new File(dir+"/outPut.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (FileReader reader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(reader);
             FileWriter writer = new FileWriter(outPutFile);
             BufferedWriter bufferedWriter = new BufferedWriter(writer)) {

            String tmpString = null;

            ArrayList<String> array = new ArrayList<String>();
            while ((tmpString = bufferedReader.readLine())!=null) {
                StringBuilder result = new StringBuilder();
                result.append(tmpString).reverse();
                array.add(result.toString());
            }


            for (String elem:array) {
                bufferedWriter.write(elem);
                bufferedWriter.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
