package com.epam.training.student_Aleksei_Guskov.fundamental.java_basics.learn_3;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumAmount=0;
        int midlAmount = 0;
        int iteration = 0;
        int amount = scanner.nextInt();
        iteration++;
        sumAmount+=amount;

        while (amount!=0){
            int newAmount = scanner.nextInt();
            if (newAmount!=0){
            sumAmount+=newAmount;
            iteration++;
            }
            amount=newAmount;
        }
        midlAmount=(amount+sumAmount)/iteration;
        System.out.println(midlAmount);
    }
}