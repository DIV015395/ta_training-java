package com.epam.training.student_Manjeet_Sharma.fundamental.java_basics.learn_3;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner inputAmount = new Scanner(System.in);
        int sumAmount = 0;
        int midlAmount = 0;
        int iteration = 0;
        int amount = inputAmount.nextInt();
        iteration++;
        sumAmount+=amount;

        while (amount != 0){
            int newAmount = inputAmount.nextInt();
            if (newAmount!=0) {
                sumAmount+=newAmount;
                iteration++;
            }
            amount=newAmount;
        }
        System.out.println((amount+sumAmount)/iteration);
    }
}