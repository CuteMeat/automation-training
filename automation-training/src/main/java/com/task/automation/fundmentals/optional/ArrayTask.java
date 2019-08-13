package com.task.automation.fundmentals.optional;

import java.util.Scanner;

public class ArrayTask {
    public static int length=0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array dimension: ");
        int size = in.nextInt();
        int[] array = new int[size];
        System.out.println("Enter array elements");
        for (int i = 0; i < size; i++) {
            System.out.printf("Array[%d]:\t", i);
            array[i] = in.nextInt();
        }


        findingTheLongestElement(array);
        findingTheShortestElement(array);
        System.out.println("Element with length other than medium: ");
        findingElementsWithLengthOtherThanMedium(array);
    }

    public static int findLength(int arrayElement) {
        int lengthOfElement = 0;
        do {
            arrayElement/=10;
            ++lengthOfElement;
        } while(arrayElement!=0);
        return lengthOfElement;
    }

    public static void findingTheShortestElement(int[] array) {
        int lengthOfElem;
        int shortestLength = findLength(array[0]);
        int shortestElem=array[0];
        Boolean repeatCheck = true;
        for (int i = 1; i < array.length; i++) {
            lengthOfElem = findLength(array[i]);
            if (lengthOfElem <= shortestLength){
                if(lengthOfElem==shortestLength) repeatCheck = false;
                else repeatCheck = true;
                shortestLength = lengthOfElem;
                shortestElem = array[i];
            }
        }

        if (repeatCheck) System.out.printf("\nShortest element: %d(length: %d)", shortestElem, shortestLength);
        else System.out.printf("\nIn this array there isn't element with a minimum length");
    }

    public static void  findingTheLongestElement(int[] array) {
        int lengthOfElem;
        int longestLength = findLength(array[0]);
        int longestElem = array[0];
        Boolean repeatCheck = true;
        for (int i = 1; i < array.length; i++) {
            lengthOfElem = findLength(array[i]);
            if (lengthOfElem >= longestLength){
                if(lengthOfElem==longestLength) repeatCheck = false;
                else repeatCheck = true;
                longestLength = lengthOfElem;
                longestElem = array[i];
            }
        }

        if (repeatCheck) System.out.printf("\nLongest element: %d(length: %d)", longestElem, longestLength);
        else System.out.printf("\nIn this array there isn't element with a maximum length");
    }

    public static void findingElementsWithLengthOtherThanMedium(int[] array) {
        int mediumLength = 0;
        int tmpLength;
        for (int element:array) {
            mediumLength+=findLength(element);
        }
        mediumLength/=array.length;

        for (int element:array) {
            tmpLength=findLength(element);
            if(tmpLength!=mediumLength) System.out.printf("\t%d(length: %d)\t", element, tmpLength);
        }
    }

}
