package com.epam.training.student_Manjeet_Sharma.fundamental.java_basics.learn_3;

import java.util.Scanner;

public class MeetAnAgent {
    final static int PASSWORD = 133976;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int passIn = scanner.nextInt();
        {
            if (passIn == PASSWORD) {
                System.out.println("Hello, Agent");
            } else {
                System.out.println("Access denied");
            }
        }
    }
}
