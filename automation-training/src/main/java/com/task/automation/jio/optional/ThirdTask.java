package com.task.automation.jio.optional;

import com.task.automation.jio.optional.replace.StringReplacer;

import java.io.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ThirdTask {
    public static void main( String[] args )
    {
        File dir = new File ("data/thirdTask");
        dir.mkdirs();
        File outPutFile = new File(dir+"/outPut.txt");

        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outPutFile));
            BufferedReader bufferedReader = new BufferedReader(new FileReader(
                    "src/main/java/com/task/automation/jio/optional/ThirdTask.java"))) {
            ArrayList<String> array = new ArrayList<String>();
            String tmpString = null;
            while ((tmpString = bufferedReader.readLine())!=null) {

                String result = StringReplacer.replace(tmpString, Pattern.compile("\\w{3,}"), (Matcher matcher) -> {
                    return matcher.group().toUpperCase();
                });
                bufferedWriter.write(result);
                bufferedWriter.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}