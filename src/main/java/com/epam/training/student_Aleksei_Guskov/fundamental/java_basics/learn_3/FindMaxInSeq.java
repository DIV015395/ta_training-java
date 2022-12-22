package com.epam.training.student_Aleksei_Guskov.fundamental.java_basics.learn_3;

import java.util.Scanner;

public class FindMaxInSeq {

    public static int max() {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        int maxAmount = amount;
                while (amount !=0) {
            int newAmount = scanner.nextInt();
            if (newAmount>amount && newAmount>maxAmount && newAmount!=0){
                maxAmount = newAmount;
                //amount=newAmount;
            }
            amount=newAmount;
        }
        return maxAmount;
    }

    public static void main(String[] args) {

        System.out.println("Test your code here!\n");

        // Get a result of your code

        System.out.println(max());
    }
}
