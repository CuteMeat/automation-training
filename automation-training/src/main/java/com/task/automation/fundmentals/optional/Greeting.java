package com.task.automation.fundmentals.optional;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        System.out.print("Input your name: ");
        Scanner mIn = new Scanner(System.in);
        String mName = mIn.nextLine();
        System.out.printf("Hello %s", mName);
        mIn.close();
    }
}
