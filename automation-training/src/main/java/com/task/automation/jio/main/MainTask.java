package com.task.automation.jio.main;

import java.io.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainTask {
    public static ArrayList<String> list = new ArrayList<String>();
    public static StringBuilder result = new StringBuilder();
    public static void main( String[] args ) {
        //String url = "E:\\test";;
        String url = "data/mainTask/outPut.txt";
        File file = new File(url);
        File dir1 = new File ("data/mainTask");
        dir1.mkdirs();
        File outPutFile = new File(dir1+"/outPut.txt");

       if (file.isDirectory()) {
           try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outPutFile))){
               StringBuilder result = new StringBuilder();

               for (File item: file.listFiles()) {
                   if(item.isDirectory()) {
                       result.append(item.getAbsolutePath()).append("\n");
                       createList(result, item.getAbsolutePath());
                   } else result.append("|").append(item.getAbsolutePath()).append("\n");
               }
               bufferedWriter.write(result.toString());

           } catch (IOException e) {
               e.printStackTrace();
           }
       } else {
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
                String tmpString = null;
                ArrayList<String> listOfFiles = new ArrayList<String>();
                while((tmpString = bufferedReader.readLine()) != null) {
                    Pattern pattern = Pattern.compile("[^\\t*|\\|].*");
                    Matcher matcher = pattern.matcher(tmpString);

                    while(matcher.find()) {
                       tmpString = tmpString.substring(matcher.start(), matcher.end());
                    }
                    listOfFiles.add(tmpString);
                }

                int amountOfFiles = amountOfFiles(listOfFiles);
                int amountOfFolders = amountOfFolders(listOfFiles);
                System.out.println("Amount of files:\t" + amountOfFiles);
                System.out.println("Amount of folder:\t" + amountOfFolders);
                System.out.println("Amount of files in folder: \t" + (amountOfFiles/amountOfFolders));
                System.out.println("Amount of symbols in file name:\t"
                        + amountOfSymbolInFilesName(listOfFiles, amountOfFiles));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
       }

    }

    public static void createList (StringBuilder result, String dir) {
        File dir1 = new File(dir) ;
        if (dir1.isDirectory()) {
            for (File item:dir1.listFiles()) {
                result.append("\t");
                if (item.isDirectory()) {
                    result.append(item.getAbsolutePath()).append("\n");
                    createList(result, item.getAbsolutePath());
                } else result.append("|").append(item.getAbsolutePath()).append("\n");
            }
        } else {
            result.append("|").append(dir1.getAbsolutePath()).append("\n");
        }
    }

    public static int amountOfFiles (ArrayList<String> listOfFiles) {
        int amount = 0;
        for (String item:listOfFiles) {
            if((new File(item).isFile())) amount++;
        }
        return  amount;
    }

    public static int amountOfFolders (ArrayList<String> listOfFiles) {
        int amount = 0;
        for (String item:listOfFiles) {
            if((new File(item).isDirectory())) amount++;
        }
        return amount;
    }

    public static int amountOfSymbolInFilesName(ArrayList<String> listOfFiles, int amountOfFiles) {
        int amountOfSymbols = 0;
        File file = null;
        for (String item:listOfFiles) {
            file = new File(item);
            if (file.isFile()) {
                amountOfSymbols += file.getName().length();
            }
        }

        return amountOfSymbols/amountOfFiles;
    }
}
