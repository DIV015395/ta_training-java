package com.epam.training.student_Manjeet_Sharma.fundamental.java_basics.learn_3;

import java.util.Scanner;

public class FindMaxInSeq {

    public static int max() {
        Scanner inputAmount = new Scanner(System.in);
        int amount = inputAmount.nextInt();
        int maxAmount = amount;
                while (amount != 0) {
            int newAmount = inputAmount.nextInt();
            if (newAmount > amount && newAmount > maxAmount && newAmount != 0){
                maxAmount = newAmount;
            }
            amount=newAmount;
        }
        return maxAmount;
    }

    public static void main(String[] args) {
        System.out.println("Test your code here!\n");
        System.out.println(max());
    }
}
