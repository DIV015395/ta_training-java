package com.epam.training.student_Manjeet_Sharma.fundamental.java_basics.learn_3;

import java.io.IOException;
import java.util.Scanner;

public class HelloStrangers {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int amountInput = scanner.nextInt();
        String names="";
        if (amountInput < 0) {
            System.out.println("Seriously? Why so negative?");
        } else if (amountInput == 0) {
            System.out.println("Oh, it looks like there is no one here");
        } else {
           for (int person = 0; person <= amountInput; person++) {
               String inputName = scanner.nextLine();
               if (person != 0) {
                   names = names + ("Hello, " + inputName + "\n");
               }
           }
           System.out.println(names);
        }
    }
}
